package packt.addressbook.util;

import packt.addressbook.model.Contact;
import java.util.ArrayList;
import java.util.List;

public class ContactUtil {
    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("1", "Alaa", "Sherif", "123-456-7890", "987-654-3210", "alaa.sherif@example.com"));
        contacts.add(new Contact("2", "Ahmed", "Smith", "111-222-3333", "444-555-6666", "ahmed.smith@example.com"));
        contacts.add(new Contact("3", "omnia", "gad", "777-888-9999", "111-222-3333", "omnia.gad@example.com"));
        return contacts;
    }
}
