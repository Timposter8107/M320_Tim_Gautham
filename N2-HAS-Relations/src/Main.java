import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contacts contact1 = new Contacts(
                "Peter Lustig",
                "peter@lustig.com",
                445934728
        );

        Contacts contact2 = new Contacts(
                "Anna Gross",
                "anna@gross.com",
                774032285
        );

        Person person1 = new Person(
                "Alex",
                "Stevens"
        );

        person1.addContact(contact1);
        person1.addContact(contact2);

        Contacts contact3 = new Contacts(
                "Lisa Bär",
                "lisa@baer.com",
                643410705
        );

        Contacts contact4 = new Contacts(
                "Jonas Zimmermann",
                "jonas@zima.com",
                324951123
        );

        Person person2 = new Person(
                "Emma",
                "Roth"
        );

        person2.addContact(contact3);
        person2.addContact(contact4);

        Contacts contact5 = new Contacts(
                "David Weber",
                "david@weber.com",
                446043357
        );

        Contacts contact6 = new Contacts(
                "Tim Wagner",
                "tim@wagner.com",
                778104439
        );

        Person person3 = new Person(
                "Laura",
                "Fischer"
        );

        person3.addContact(contact5);
        person3.addContact(contact6);

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        for (Person person: personArrayList) {
            System.out.println(person.getFirstName() + " " + person.getSecondName());
            for (Contacts contact: person.getContacts()) {
                System.out.println(contact.getName() + ", " + contact.getEmail() + ", " + contact.getPhoneNumber());
            }
        }
    }
}