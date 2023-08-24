package _15_DesignPatterns.builder2;

import java.util.*;

public class Main {

    private static final String CREATE_COMMAND = "CREATE";
    private static final String CONTACT_INFO_COMMAND = "INFO";
    private static final String DELETE_CONTACT_COMMAND = "DELETE";
    private static final String PHONEBOOK_COMMAND = "PHONEBOOK";
    private static final String END_COMMAND = "END";

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

//   readContactInfo(scanner);
   readContactInfo2();
    }

    private static void readContactInfo2() {

        Scanner input = new Scanner(System.in);
        List<Contact> contactList = new ArrayList<>();

        while (true) {
            System.out.print("Enter a command: ");
            String command = input.nextLine();

            if (CREATE_COMMAND.equalsIgnoreCase(command)) {
                List<String> contactInfo = readContactInfo(input);
                Contact contact = Contact.create(contactInfo.get(0), contactInfo.get(1))
                        .company(contactInfo.get(2))
                        .title(contactInfo.get(3))
                        .email(contactInfo.get(4))
                        .website(contactInfo.get(5))
                        .birthday(contactInfo.get(6))
                        .build();
                contactList.add(contact);
                System.out.println("Contact created!");
            } else if (CONTACT_INFO_COMMAND.equalsIgnoreCase(command)) {
                // ... (code to display contact info)
            } else if (DELETE_CONTACT_COMMAND.equalsIgnoreCase(command)) {
                // ... (code to delete a contact)
            } else if (PHONEBOOK_COMMAND.equalsIgnoreCase(command)) {
                // ... (code to display phonebook)
            } else if (END_COMMAND.equalsIgnoreCase(command)) {
                break;
            } else {
                System.out.println("Invalid command!");
            }
        }

    }

    private static List<String> readContactInfo(Scanner input) {
        List<String> contactInfo = new ArrayList<>();

        System.out.print("Name: ");
        contactInfo.add(input.nextLine());

        System.out.print("Number: ");
        contactInfo.add(input.nextLine());

        System.out.print("Company: ");
        contactInfo.add(input.nextLine());

        System.out.print("Title: ");
        contactInfo.add(input.nextLine());

        System.out.print("Email: ");
        contactInfo.add(input.nextLine());

        System.out.print("Website: ");
        contactInfo.add(input.nextLine());

        System.out.print("Birthday: ");
        contactInfo.add(input.nextLine());

        return contactInfo;
    }
}
