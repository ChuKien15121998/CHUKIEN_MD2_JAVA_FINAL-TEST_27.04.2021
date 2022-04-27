package Config;

import Model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWriteFile {
//    public static void writeToFile (List<Contact> contactList) {
//        try {
//            FileWriter fileWriter = new FileWriter("data_contact.txt");
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            for (Contact contact: contactList) {
//                bufferedWriter.write(contact.getPhoneNumber() + "," + contact.getGroup() + "," + contact.getName() + "," + contact.getAddress() + "," + contact.getGender() + "," + contact.getDateOfBirth() + "," + contact.getEmail() + ",\n");
//            }
//
//            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("");
//        }
//    }
//
//    public static List<Contact> readFromFile() {
//        List<Contact> contactList = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader("data_contact.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = "";
//            while ( (line = bufferedReader.readLine()) != null) {
//                String content[] = line.split(";");
//                String phoneNumber = content[0];
//                String group = content[1];
//                String name = content[2];
//                String gender = content[3];
//                String address = content[4];
//                String email = content[5];
//                String dateOfBirth = content[6];
//                Contact contact = new Contact(phoneNumber, group, name, gender, address, email, dateOfBirth);
//                contactList.add(contact);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("");
//        } catch (IOException e) {
//            System.out.println("");
//        }
//        return contactList;
//    }

    public static void writeToFile (List<Contact> contactList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("data_contact.txt");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(contactList);

            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("");
        } catch (IOException e) {
            System.out.println("");
        }
    }

    public static List<Contact> readDataFromFile () {
        List<Contact> contactList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("data_contact.txt");
            ois = new ObjectInputStream(fis);

            contactList = (List<Contact>) ois.readObject();

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("");
        } catch (IOException e) {
            System.out.println("");
        } catch (ClassNotFoundException e) {
            System.out.println("");
        }
        return contactList;
    }
}
