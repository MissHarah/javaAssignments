package chapterTwo;

import java.security.SecureRandom;

public class GenerateNumber {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        for (int counter = 1; counter <= 10; counter++) {

            int number = 1 + randomNumber.nextInt(10);
            if (counter  == 11)
                break;
                System.out.println(number);



            }
        }
    }


