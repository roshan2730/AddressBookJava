public class Person {
                private String fName;
                private String lName;
                private String address;
                private String city;
                private String state;
                private int zip;
                private String phoneNumber;
                private String emailId;

        /*        public Person() {
                }
                public Person(String fName, String lName, String address, String city, String state, int zip, String phoneNumber, String emailId) {
                    this.fName = fName;
                    this.lName = lName;
                    this.address = address;
                    this.city = city;
                    this.state = state;
                    this.zip = zip;
                    this.phoneNumber = phoneNumber;
                    this.emailId = emailId;
                }
*/
                public String getfName() {
                    return fName;
                }
                public void setfName(String fName) {
                    this.fName = fName;
                }
                public String getlName() {
                    return lName;
                }
                public void setlName(String lName) {
                    this.lName = lName;
                }
                public String getAddress() {
                    return address;
                }
                public void setAddress(String address) {
                    this.address = address;
                }
                public String getCity() {
                    return city;
                }
                public void setCity(String city) {
                    this.city = city;
                }
                public String getState() {
                    return state;
                }
                public void setState(String state) {
                    this.state = state;
                }
                public int getZip() {
                    return zip;
                }
                public void setZip(int zip) {
                    this.zip = zip;
                }
                public String getPhoneNumber() {
                    return phoneNumber;
                }
                public void setPhoneNumber(String phoneNumber) {
                    this.phoneNumber = phoneNumber;
                }
                public String getEmailId() {
                    return emailId;
                }
                public void setEmailId(String emailId) {
                    this.emailId = emailId;
                }

                @Override
                public String toString() {
                    return "Person{" +
                            "fName='" + fName + '\'' +
                            ", lName='" + lName + '\'' +
                            ", address='" + address + '\'' +
                            ", city='" + city + '\'' +
                            ", state='" + state + '\'' +
                            ", zip=" + zip +
                            ", phoneNumber=" + phoneNumber +
                            ", emailId='" + emailId + '\'' +
                            '}';
                }

                @Override
                public boolean equals(Object obj) {
                    if(obj instanceof Person){
                        Person person = (Person) obj;
                        return fName.equals(person.fName);
                    }
                    return false;
                }
            }

