package lesson14;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Long phoneNumber;
    private Operator operator;
    private Set<Contact> contacts = new HashSet<>();

    public Contact(String name, Long phoneNumber, Operator operator) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Collection<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    @Override
    public String toString() {
        return "Контакт {" +
                "ФИО='" + name + '\'' +
                ", номер телефона=" + phoneNumber +
                ", оператор=" + operator +
                ", тип=" + (operator.isMobile() ? "мобильный" : "городской") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!name.equals(contact.name)) return false;
        if (!phoneNumber.equals(contact.phoneNumber)) return false;
        return operator == contact.operator;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + operator.hashCode();
        return result;
    }
}
