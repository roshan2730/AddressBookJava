import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    HashMap <String, Person> personList = new HashMap<String, Person>();
    Scanner scanner = new Scanner(System.in);

    public Person getDetailsFromUser()
    {
        System.out.println("Please enter first name : ");
        String fName = scanner.next();
        System.out.println("Please enter last name : ");
        String lName = scanner.next();
        System.out.println("Please enter email id : ");
        String email = scanner.next();
        System.out.println("Please enter phone number : ");
        String phone = scanner.next();
        System.out.println("Please enter address : ");
        String address = scanner.next();
        System.out.println("Please enter zip code : ");
        int zip = scanner.nextInt();
        System.out.println("Please enter city : ");
        String city = scanner.next();
        System.out.println("Please enter state : ");
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
        personList.put(person.getEmailId(), person);
    }
    public void updateContactDetail(String emailId){
        Person person = personList.get(emailId);

        System.out.println("1 : Please Enter Your First Name \n" +
                "2 : Please Enter Your Last Name \n" +
                "3 : Please Enter Email Id \n" +
                "4 : Please Enter phone number \n" +
                "5 : Please Enter address \n" +
                "6 : Please Enter zip code \n" +
                "7 : Please Enter city \n" +
                "8 : Please Enter state");

        int selectOption = scanner.nextInt();
        switch (selectOption){
            case 1:
                System.out.println("Please Enter the first name : ");
                String fName = scanner.next();
                person.setfName(fName);
                break;
            case 2:
                System.out.println("Please Enter the last name : ");
                String lName = scanner.next();
                person.setlName(lName);
                break;
            case 3:
                System.out.println("Please Enter email id : ");
                String email = scanner.next();
                person.setEmailId(emailId);
                break;
            case 4:
                System.out.println("Please Enter phone number : ");
                String phone = scanner.next();
                person.setPhoneNumber(phone);
                break;
            case 5:
                System.out.println("Please Enter address : ");
                String address = scanner.next();
                person.setAddress(address);
                break;
            case 6:
                System.out.println("Please Enter zip code : ");
                int zipCode = scanner.nextInt();
                person.setZip(zipCode);
                break;
            case 7:
                System.out.println("Please Enter City");
                String city = scanner.next();
                person.setCity(city);
                break;
            case 8:
                System.out.println("Please Enter state");
                String state = scanner.next();
                person.setState(state);
                break;
            default:
                System.out.println("please select valid option");
                break;
        }
    }

    public void deletePerson()
    {
        System.out.println("Enter the email id to delete : ");
        String email = scanner.next();
        if (!personList.containsKey(email))
        {
            System.out.println("Please provide valid email id");
            deletePerson();
        }
        personList.remove(email);
    }

    public void printAllDetails()
    {
        System.out.println(personList);
    }

    public void getUserChoice()
    {
        while (true){
            System.out.println("1: Click to add new Person \n" +
                    "2: Click to update existing Person \n" +
                    "3: Click to print Person's list \n" +
                    "4: Click to delete contact \n" +
                    "0: Click to terminate the program");
            int selectedOption = scanner.nextInt();
            switch (selectedOption){
                case 1:
                    addNewContact();
                    break;
                case 2:
                    System.out.println("Enter email id to update");
                    String email = scanner.next();
                    updateContactDetail(email);
                    break;
                case 3:
                    printAllDetails();
                    break;
                case 4:
                    deletePerson();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select valid option");
                    break;
            }

        }

    }
}
