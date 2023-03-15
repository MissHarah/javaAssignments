import java.util.ArrayList;
import java.util.List;

public class mySchool {

    public static void main(String[] args) {

        List<Student> listOfStudent = new ArrayList<>();

        Student student = new Student();
     Student student1 =   student.studentRegistration("Samule","hanee","08144565014","male");


    Student student2 =   student.studentRegistration("Ike","ola","09027206787","female");


        Student student3 =    student.studentRegistration("Nimmah","tao","08123706373","male");


        Student student4 =    student.studentRegistration("Hikmah","ameerah","07077028897","female");


        Student student5 =   student.studentRegistration("Mary","Desalu","08026202678","male");

        Student student6 =    student.studentRegistration("desalu","tayo","08056125309","female");

        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);
        listOfStudent.add(student4);
        listOfStudent.add(student5);
        listOfStudent.add(student6);

        System.out.println(listOfStudent.size());

        for (int i = 0; i < listOfStudent.size(); i++) {
            System.out.println(listOfStudent.get(i));
        }
        listOfStudent = List.of(

          new Student("Samule","hanee","08144565014","male"),
          new Student("Ike","ola","09027206787","female")) ,
          new Student()

        );



    }
}
