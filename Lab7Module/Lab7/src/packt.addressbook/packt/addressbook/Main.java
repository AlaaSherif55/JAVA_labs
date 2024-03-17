package packt.addressbook;

import packt.addressbook.model.Contact;
import packt.addressbook.util.ContactUtil;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContactUtil contactUtil = new ContactUtil();
        List<Contact> contacts = contactUtil.getContacts();

        for (Contact contact : contacts) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName());
        }
    }
}
