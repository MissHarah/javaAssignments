package ChapterFive.chapterThree;

import java.util.Scanner;

public class ClassWork {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int counter = 0;

        System.out.print("Enter first grades or -1 to quit");
        int grades = input.nextInt();

        while ((double) grades != -1) {
            total += grades;
            counter++;
            System.out.println("Enter next grades or  -1 to quit");
            grades = input.nextInt();
        }


            if (counter!=0){
            double average = (double) total/counter;
                System.out.printf("the average of %d grade is %f",counter,average);

            }
            else
                System.out.print("no grades were entered");
        }
    }
