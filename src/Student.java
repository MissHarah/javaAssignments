public class Student {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    public String Gender;

    public Student(String firstName,String lastName,String phoneNumber,String Gender){
        this.firstName = firstName;
        this.lastName = lastName;
        if(phoneNumber.length()!=11){
            System.out.println("invalid phone number");
        }
        this.phoneNumber = phoneNumber;
        this.Gender = Gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber.length()!=11){
            System.out.println("invalid phoneNumber");
        }
        this.phoneNumber =phoneNumber;
    }
    public String getPhoneNumber(){

        return phoneNumber;
    }
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    public String getGender(){

        return Gender;
    }

    public Student studentRegistration(String firstName,String lastName, String phoneNumber,String Gender){
        Student registeredStudent = new Student(firstName,lastName,phoneNumber,Gender);
        registeredStudent.setFirstName(firstName);
        return registeredStudent;
    }
    public Student (){

    }
    public Student SetStudentRegistration(String firstName,String lastName,String phoneNumber,String Gender){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setPhoneNumber(phoneNumber);
        student.setGender(Gender);
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
//    private String name;
//    private int money;
//
//    public Person(String name, int money) {
//        this.name = name;
//        this.money = money;
//    }
//
//    public static void main(String[] args) {
//
//        Person person1 = new Person("goat",300);
//        Person person2 = new Person("samuel-goat",300);
//
////        String x = "water";
//        String y = "eve";
//        System.out.println("the variable stored in x is " +x);
//        System.out.println("the variable stored in y is " +y);
//            String name = "theQueenCode";
//           System.out.println(name.toUpperCase());
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//        int a;
//        int b;
//        a =10;
//        b = a;
//        a = 100;
//        System.out.println("a =" + a + " - b = " +b);

//

//        String queenCode = new String("theQueenCode");
//        System.out.println(name.contains(queenCode));
//
//        int haneefahAge = 27;
//        int abdulRahmanAge = 32;
//        System.out.println( haneefahAge + " is " + abdulRahmanAge);
//        boolean isHaneefahOlderThanAbdulRahman = haneefahAge>abdulRahmanAge;
//        System.out.println( haneefahAge < abdulRahmanAge);
//        System.out.println(haneefahAge!=abdulRahmanAge);
//        boolean isShort = true;
//        System.out.println(isShort && 5 < 2);
//        String name = "Haneefah";
//        System.out.println( name.contains("H") && 10<10 || 2==2);

//        String gender = "MALE";
//        if (gender.equals("FEMALE")) {
//            ;
//        } else if (gender.equals("i am a MALE")) {
//
//        } else if (gender.equals("cant disclose")) {
//
//        } else {
//
//        }

//        switch (gender.toUpperCase()){
//            case "FEMALE":
//                System.out.println("i am a female");
//                break;
//            case "MALE":
//                System.out.println("i am a male");
//                break;
//            case "COMPLECATED":
//                System.out.println("complecated");
//                break;
//            default:
//        }
//    }
//
    }



