public class AddressBookMain {
    public static void main(String[] args) {
        Person person = new Person();

        //setting the value of contact details
        person.setfName("Roshan");
        person.setlName("Gupta");
        person.setEmailId("abc12@gmail.com");
        person.setPhoneNumber("91 9988776655");
        person.setAddress("Jai Prakash Nagar");
        person.setZip(800001);
        person.setCity("Patna");
        person.setState("Bihar");

        System.out.println("Details of Person" +person);
    }
}
