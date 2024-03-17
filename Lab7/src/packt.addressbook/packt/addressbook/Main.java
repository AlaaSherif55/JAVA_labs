package packt.addressbook;

import packt.addressbook.model.Contact;
import packt.addressbook.util.ContactUtil;
import packt.addressbook.util.SortUtil;
import java.util.List;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        ContactUtil contactUtil = new ContactUtil();
        List<Contact> contacts = contactUtil.getContacts();

        SortUtil<Contact> contactSortUtil = new SortUtil<>();
        contacts = contactSortUtil.sort(contacts, Comparator.comparing(Contact::getFirstName));


        for (Contact contact : contacts) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName());
        }
    }
    
}
