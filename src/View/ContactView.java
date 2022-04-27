package View;

import Config.ConfigReadAndWriteFile;
import Model.Contact;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContactView {
    List<Contact> contactList = ConfigReadAndWriteFile.readDataFromFile();
    Scanner scanner = new Scanner(System.in);
    public void createContact() {
        System.out.println("ENTER PHONENUMBER (9 OR 10 CHARACTERS): ");
        String phoneNumber;
        boolean checkPhoneNumber;
        while (true) {
            phoneNumber = scanner.nextLine();
            checkPhoneNumber = Pattern.matches("^0[0-9]{8,9}$", phoneNumber);
            if (!checkPhoneNumber) {
                System.err.println("PHONENUMBER FAILED! PLEASE TRY AGAIN!");
            } else {
                break;
            }
        }
        System.out.println("ENTER GROUP: ");
        String group = scanner.nextLine();
        System.out.println("ENTER NAME: ");
        String name = scanner.nextLine();
        System.out.println("ENTER GENDER: ");
        String gender = scanner.nextLine();
        System.out.println("ENTER ADDRESS: ");
        String address = scanner.nextLine();
        System.out.println("ENTER BIRTH: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("ENTER THE EMAIL: ");
        String email;
        boolean checkEmail;
        while (true) {
            email = scanner.nextLine();
            checkEmail = Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", email);
            if (!checkEmail) {
                System.err.println("EMAIL FAILED! PLEASE TRY AGAIN!");
            } else {
                break;
            }
        }
        Contact contact = new Contact(phoneNumber, group, name, gender, address, email, dateOfBirth);
        contactList.add(contact);
        ConfigReadAndWriteFile.writeToFile(contactList);
        System.out.println("SUCCESSFUL CREATION");
        System.out.println("ENTER ANY KEY TO COME BACK MENU: ");
        String backMenu = scanner.nextLine();
        new Main();
    }

    public void showContactList() {
        for (Contact contact: contactList) {
            System.out.println(contact);
        }
        System.out.println("ENTER ANY KEY TO COME BACK MENU: ");
        String backMenu = scanner.nextLine();
        new Main();
    }

    public void updateContact(String phoneNumber) {
        int count = 0;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                System.out.println("ENTER NEW PHONENUMBER");
                String newPhoneNumber = scanner.nextLine();
                contactList.get(i).setPhoneNumber(newPhoneNumber);
                ConfigReadAndWriteFile.writeToFile(contactList);
            }
            else if (count == 0 && i == contactList.size() - 1) {
                System.out.println("NO PHONENUMBER TO DELETE!");
            }
        }
        System.out.println("ENTER ANY KEY TO COME BACK MENU: ");
        String backMenu = scanner.nextLine();
        new Main();
    }

    public void deleteContact(String phoneNumber) {
        int count = 0;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                contactList.remove(contactList.get(i));
                ConfigReadAndWriteFile.writeToFile(contactList);
            }
            else if (count == 0 && i == contactList.size() - 1) {
                System.out.println("NO PHONENUMBER TO DELETE!");
            }
        }
        System.out.println("ENTER ANY KEY TO COME BACK MENU: ");
        String backMenu = scanner.nextLine();
        new Main();
    }


    public void searchContactByPhoneNumber(String phoneNumber) {
        int count = 0;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                System.out.println(contactList.get(i));
            }
            else if (count == 0 && i == contactList.size() - 1) {
                System.out.println("NO PHONENUMBER TO DELETE!");
            }
        }
        System.out.println("ENTER ANY KEY TO COME BACK MENU: ");
        String backMenu = scanner.nextLine();
        new Main();
    }

    public void searchContactByName(String name) {
        int count = 0;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(contactList.get(i));
            }
            else if (count == 0 && i == contactList.size() - 1) {
                System.out.println("NO PHONENUMBER TO DELETE!");
            }
        }
        System.out.println("ENTER ANY KEY TO COME BACK MENU: ");
        String backMenu = scanner.nextLine();
        new Main();
    }

    public void writeToFile() {
        ConfigReadAndWriteFile.writeToFile(contactList);
        System.out.println("WRITE SUCCESSFULLY");
        System.out.println("ENTER ANY KEY TO COME BACK MENU: ");
        String backMenu = scanner.nextLine();
        new Main();
    }

    public void readFromFile() {
        contactList = ConfigReadAndWriteFile.readDataFromFile();
        System.out.println("READ SUCCESSFULLY");
        System.out.println("ENTER ANY KEY TO COME BACK MENU: ");
        String backMenu = scanner.nextLine();
        new Main();
    }

}
