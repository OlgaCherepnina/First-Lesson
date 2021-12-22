package lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PhoneBook {
    private List<Contact> contactList;
    private Contact[] contactArray;

    public List<Contact> getContactList() {
        return contactList;
    }

    public Contact[] getContactArray() {
        return contactArray;
    }

    // Добавляем одни и те же контакты в список и массив для последующей проверки производительности
    public void fillPhoneBook(int numberOfContacts) {
        contactList = new ArrayList<>(numberOfContacts);
        contactArray = new Contact[numberOfContacts];

        for (int i = 0; i < numberOfContacts; i++) {
            Contact contact = generateRandomContact();
            contactList.add(contact);
            contactArray[i] = contact;
        }

        addRandomRelatedContacts();
    }


    private void addRandomRelatedContacts() {
        int contactSize = contactList.size();

        for (Contact contact : contactList) {
            // Случайно выбираем сколько будет связанных контактов от 0 до 500
            // Контактов может быть меньше, так как не проверяем на то, что контакт уже был добавлен
            int numberOfRelatedContacts = new Random().nextInt(500);

            for (int i = 0; i < numberOfRelatedContacts; i++) {
                // Добавляем случайный контакт в список связанных контактов
                int contactId = new Random().nextInt(contactSize);
                contact.addContact(contactList.get(contactId));
            }
        }
    }

    private Contact generateRandomContact() {
        // Генерируем случайное ФИО из трех букв
        char lastLetter = (char) (new Random().nextInt(26) + 'a');
        char nameLetter = (char) (new Random().nextInt(26) + 'a');
        char patronymicLetter = (char) (new Random().nextInt(26) + 'a');
        String name = (lastLetter + ". " + nameLetter + ". " + patronymicLetter + ".").toUpperCase();

        // Генерируем номер телефона, он может быть мобильный (одного из 4 операторов) или городской
        Long phoneNumber;
        if (new Random().nextInt(6) < 5) {   // Мобильный (увеличиваем шанс создания мобильного номера)
            phoneNumber = new Random().nextLong(9000000000L, 9999999999L);
        } else { // Городской (код Санкт-Петербурга 812)
            phoneNumber = new Random().nextLong(8120000000L, 8129999999L);
        }

        // Проверяем начальный код номера и устанавливаем оператора связи
        Operator operator = null;
        for (Operator op : Operator.values()) {
            long operatorCode = phoneNumber / 10000000L;
            if (op.getFrom() <= operatorCode && operatorCode <= op.getTo()) {
                operator = op;
                break;
            }
        }

        return new Contact(name, phoneNumber, operator);
    }
}
