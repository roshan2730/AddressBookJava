import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    //Declaring HasMap to store all Person's details
    HashMap <String, Person> contactList = new HashMap<String, Person>();


    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addNewContact();
    }

    public Person getDetailsFromUser()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name : ");
        String fName = scanner.next();
        System.out.println("Enter last name : ");
        String lName = scanner.next();
        System.out.println("Enter email id : ");
        String email = scanner.next();
        System.out.println("Enter phone number : ");
        String phone = scanner.next();
        System.out.println("Enter address : ");
        String address = scanner.next();
        System.out.println("Enter zip code : ");
        int zip = scanner.nextInt();
        System.out.println("Enter city : ");
        String city = scanner.next();
        System.out.println("Enter state : ");
        String state = scanner.next();

        Person person = new Person();
        person.setfName(fName);
        person.setlName(lName);
        person.setEmailId(email);
        person.setPhoneNumber(phone);
        person.setAddress(address);
        person.setZip(zip);
        person.setCity(city);
        person.setState(state);

        return person;
    }

    public void addNewContact()
    {
        Person person = getDetailsFromUser();
        contactList.put(person.getEmailId(), person);
    }
}
