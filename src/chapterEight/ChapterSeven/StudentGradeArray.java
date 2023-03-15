package chapterEight.ChapterSeven;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeArray {

    public static void main(String[] args) {

        int[] grades = new int[5];
        Scanner scanner = new Scanner(System.in);




     int lowest =Integer.MAX_VALUE;
     int highest= 0;
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade:");
           int grade = scanner.nextInt();

           total += grade;
            //total= total/grades.length;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest ){
                lowest = grade;
            }
        }

            int average;
            average = total/ grades.length;
            System.out.println("print average is:" +average);
            System.out.println("print highest is:"+highest);
        System.out.println("print lowest is:"+lowest);




        }
//        {
//
//        {     int highest;
//            highest = total/grades.length;
//            System.out.println("print highest is:" +highest);
//        }



//     System.out.println("print average is:" +average);
//        System.out.println("the highest is: %d%n: the lowest is: %d%n the Average is: %d%n");
    }
