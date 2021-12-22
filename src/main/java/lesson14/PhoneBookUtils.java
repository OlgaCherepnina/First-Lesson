package lesson14;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookUtils {
    private static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        phoneBook.fillPhoneBook(10000);

        // Ищем популярный контакт и измеряем производительность для списка
        long start = System.currentTimeMillis();
        Contact popularContactList = findMostPopularContactList();
        long end = System.currentTimeMillis();
        System.out.printf("На поиск популярного контакта в списке потребовалось %d милисекунд%n", end - start);

        // Ищем популярный контакт и измеряем производительность для массива
        start = System.currentTimeMillis();
        Contact popularContactArray = findMostPopularContactArray();
        end = System.currentTimeMillis();
        System.out.printf("На поиск популярного контакта в массиве потребовалось %d милисекунд%n", end - start);

        // Контак должен быть одним и тем же.
        System.out.println("Поиск выдал одинаковый результат: " + popularContactList.equals(popularContactArray));
    }

    public static Contact findMostPopularContactList() {
        Map<Contact, Integer> popularMap = new HashMap<>();

        // Создаем карту с контактом и частотой нахождения у другого человека
        for (Contact contact : phoneBook.getContactList()) {
            for (Contact relatedContact : contact.getContacts()) {
                // Берем человека (контакт), смотрим кто у него есть в друзьях (связанных контактах)
                // у связанных, которые встречаются впервые ставим 1 или увеличиваем счетчик
                if (popularMap.containsKey(relatedContact)) {
                    popularMap.put(relatedContact, popularMap.get(relatedContact) + 1);
                } else {
                    popularMap.put(relatedContact, 1);
                }
            }
        }

        int max = 0;
        Contact mostPopularContact = null;
        for (Map.Entry<Contact, Integer> entry : popularMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostPopularContact = entry.getKey();
            }
        }

        System.out.println("Самый популярный контакт " + mostPopularContact + ". Он встречается у " + max + " людей.");

        return mostPopularContact;
    }

    public static Contact findMostPopularContactArray() {
        Map<Contact, Integer> popularMap = new HashMap<>();

        // Создаем карту с контактом и частотой нахождения у другого человека
        for (Contact contact : phoneBook.getContactArray()) {
            for (Contact relatedContact : contact.getContacts()) {
                // Берем человека (контакт), смотрим кто у него есть в друзьях (связанных контактах)
                // у друзей, которые встречаются впервые ставим 1 или увеличиваем счетчик
                if (popularMap.containsKey(relatedContact)) {
                    popularMap.put(relatedContact, popularMap.get(relatedContact) + 1);
                } else {
                    popularMap.put(relatedContact, 1);
                }
            }
        }

        int max = 0;
        Contact mostPopularContact = null;
        for (Map.Entry<Contact, Integer> entry : popularMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostPopularContact = entry.getKey();
            }
        }

        System.out.println("Самый популярный контакт " + mostPopularContact + ". Он встречается у " + max + " людей.");

        return mostPopularContact;
    }
}
