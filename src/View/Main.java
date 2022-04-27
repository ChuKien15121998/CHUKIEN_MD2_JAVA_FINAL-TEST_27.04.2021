package View;

import java.util.Scanner;

public class Main {
    public Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===CHOOSE ONE OF THE FOLLOWING FUNCTION===");
        System.out.println("1. SHOW CONTACT LIST");
        System.out.println("2. ADD NEW CONTACT");
        System.out.println("3. UPDATE CONTACT");
        System.out.println("4. DELETE CONTACT");
        System.out.println("5. FIND CONTACT BY PHONENUMBER");
        System.out.println("6. FIND CONTACT BY NAME");
        System.out.println("7. READ FROM FILE");
        System.out.println("8. WRITE FROM FILE");
        System.out.println("9. EXIT");
        System.out.println("===========================================");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                new ContactView().showContactList();
                break;
            case 2:
                new ContactView().createContact();
                break;
            case 3:
                System.out.println("ENTER CONTACT'S PHONENUMBER YOU WANNA UPDATE: ");
                String phoneNumber = scanner.nextLine();
                new ContactView().updateContact(phoneNumber);
                break;
            case 4:
                System.out.println("ENTER CONTACT'S PHONENUMBER YOU WANNA DELETE: ");
                String phoneNumber1 = scanner.nextLine();
                new ContactView().deleteContact(phoneNumber1);
                break;
            case 5:
                System.out.println("ENTER CONTACT'S PHONENUMBER YOU WANNA SEARCH: ");
                String phoneNumber2 = scanner.nextLine();
                new ContactView().searchContactByPhoneNumber(phoneNumber2);
                break;
            case 6:
                System.out.println("ENTER CONTACT'S NAME YOU WANNA SEARCH: ");
                String name = scanner.nextLine();
                new ContactView().searchContactByName(name);
                break;
            case 7:
                System.out.print("Are you sure to read file? Y/N");
                new ContactView().readFromFile();
                break;
            case 8:
                new ContactView().writeToFile();
                break;
            case 9:
                System.exit(0);
        }
    }


    public static void main(String[] args) {
        new Main();
    }
}
