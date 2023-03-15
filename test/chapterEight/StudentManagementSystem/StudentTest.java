package chapterEight.StudentManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student prospectiveStudent;
    private StudentData studentData;
    private School school;


    @BeforeEach
    void setUp() {
        prospectiveStudent = new Student();
        studentData = new StudentData();
        school = new School();
    }
    @Test
    void testThatStudentCanApply(){
        prospectiveStudent.setFirstName("Haneefah");
        prospectiveStudent.setLastName("Sanni");
        prospectiveStudent.setEmail("my@gmail.com");
        Student registerStudent = prospectiveStudent.apply(studentData);
        System.out.println(registerStudent);
        System.out.println(prospectiveStudent.getFirstName());
        assertNotNull(registerStudent);
    }
    @Test
    void testTheNumberOfRegisteredStudent(){
        Student registerStudent = prospectiveStudent.apply(studentData);
        System.out.println(registerStudent);
        assertNotNull(registerStudent);
        int studentSize = school.getTotalNumberOfStudentRegisteredStudent();
        assertEquals(1,studentSize);
    }
}