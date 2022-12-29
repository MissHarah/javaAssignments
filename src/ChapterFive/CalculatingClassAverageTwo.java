package ChapterFive;

import java.util.Scanner;

public class CalculatingClassAverageTwo {

    public static void main(String[] args) {

        Scanner arbitraryNumber = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int numberOfStudent = arbitraryNumber.nextInt();

        int averageGrade = 0;
        int total = 0;

        for (int i = 1; i <= numberOfStudent; i++) {

            System.out.printf("Enter grade %d%n", i);
            int grade = arbitraryNumber.nextInt();

            total  += grade;
        }
        averageGrade = total /numberOfStudent;
        System.out.printf("the Average grade is %d%n" , averageGrade);



    }
}











