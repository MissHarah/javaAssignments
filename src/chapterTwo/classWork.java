package chapterTwo;

import java.util.Scanner;

public class classWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        System.out.print("enter first grade or-1 to quit");
        int grades = input.nextInt();

        while (grades!=-1){

            total= total +grades; //           total+=grade;
            counter++;
            System.out.println("enter first grade or-1 to quit");
            grades = input.nextInt();


        }
        if (counter!=0 ) {
            double average = (double) total / counter;
            System.out.printf("the average of %d grade is %f", counter, average);
        }
            else
            System.out.println("no grade were Enter");


    }
}
