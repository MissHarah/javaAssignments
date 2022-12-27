package chapterTwo;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int numberone = input.nextInt();
        System.out.println("enter second number");
        int numbertwo = input.nextInt();
      int sum = numberone +numbertwo;
        int sum2 = numberone * numbertwo;

        System.out.println(sum);

        System.out.println(sum2);
    }
}
