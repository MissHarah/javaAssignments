package chapterTwo;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("how old are you ?");
//        int Age = input.nextInt();

//        int Roajunior = 2;
//        Roajunior +=15;
//
        int age = 11;
        if (age >= 18) {
            System.out.println("you are an adult");
        }
        else if (age <=10){
            System.out.println("you are a baby");
        }
         else{
            System.out.println("you are a teenager");
        }
    }
}

//


