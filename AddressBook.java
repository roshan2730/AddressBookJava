import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

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
       // testDrivenData testSampleData = new testDrivenData();
       Person person = getDetailsFromUser();
       personList.put(person.getEmailId(), person);
       // personList = testSampleData.sampleData();
    }
    public void updateContactDetail(){
        System.out.println("Please Enter Email Id to update : ");
        String email = scanner.next();
        Person person = personList.get(email);
        if(!personList.containsKey(email))
        {
            System.out.println("Invalid email id");
            updateContactDetail();
        }
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
                System.out.println("Please Enter phone number : ");
                String phone = scanner.next();
                person.setPhoneNumber(phone);
                break;
            case 4:
                System.out.println("Please Enter address : ");
                String address = scanner.next();
                person.setAddress(address);
                break;
            case 5:
                System.out.println("Please Enter zip code : ");
                int zipCode = scanner.nextInt();
                person.setZip(zipCode);
                break;
            case 6:
                System.out.println("Please Enter City");
                String city = scanner.next();
                person.setCity(city);
                break;
            case 7:
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

    public void printAllDetails(){
    for (Person allContacts : personList.values())
    {
        System.out.println(allContacts);
    }
}

    public void searchByCityOrState(){

        System.out.println("Enter city name : ");
        String city = scanner.next();
        System.out.println("Enter state name : ");
        String state = scanner.next();

        Map<String, Person> filterDetail = personList.entrySet()
                .stream()
                .filter(map -> map.getValue().getState().contains(state))
                .filter(map -> map.getValue().getCity().contains(city))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        System.out.println(filterDetail);
    }

    public void countByCityOrState(){
        System.out.println("Enter city name : ");
        String city = scanner.next();
        System.out.println("Enter state name : ");
        String state = scanner.next();

        Map<Person, Long> filteredCountContact = personList.values()
                .stream()
                .filter(map -> map.getState().contains(state))
                .filter(map -> map.getCity().contains(city))
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()));

        System.out.println(filteredCountContact);
    }


    public void getUserChoice()
    {
        boolean isTerminate = false;
        while (!isTerminate){
            System.out.println("1: Click to add new Person \n" +
                    "2: Click to update existing Person \n" +
                    "3: Click to print Person's list \n" +
                    "4: Click to delete contact \n" +
                    "5: Click to search by city or state : \n" +
                    "6: Click to count the number of Person belong to same city or state \n" +
                    "0: Click to terminate the program");
            int selectedOption = scanner.nextInt();
            switch (selectedOption){
                case 1:
                    addNewContact();
                    break;
                case 2:
                    updateContactDetail();
                    break;
                case 3:
                    printAllDetails();
                    break;
                case 4:
                    deletePerson();
                    break;
                case 5:
                    searchByCityOrState();
                    break;

                case 6:
                    countByCityOrState();
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

