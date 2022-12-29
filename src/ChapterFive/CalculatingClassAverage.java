package ChapterFive;

import java.util.Scanner;

public class CalculatingClassAverage {

    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);

        int totalGrade = 0;

        for (int i = 1; i<=10; i++){
            System.out.printf("Enter grade %d%n", i);
            int studentGrade =grade.nextInt();

            totalGrade += studentGrade;
        }
        System.out.printf("Total Grade is %d%n",totalGrade );

        double average = (double) totalGrade /10;
        System.out.printf("Average Grade is %.2f%n",average);


    }

    }


