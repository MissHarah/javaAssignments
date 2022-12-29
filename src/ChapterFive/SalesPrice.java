package ChapterFive;

import java.util.Scanner;

public class SalesPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        int productNumber = 0;
        while (true) {
            System.out.println("Enter product number");
            productNumber = scanner.nextInt();
            if(productNumber == -1){
                break;
            }
            System.out.println("Enter quantity sold");

            int quantitySold = scanner.nextInt();

            double price = 0;
            switch (productNumber) {
                case 1 -> price = 2.98;
                case 2 -> price = 4.50;
                case 3 -> price = 9.98;
                case 4 -> price = 4.49;
                case 5 -> price = 6.87;
            }
            double retailPrice = price * quantitySold;
            totalPrice += retailPrice;
        }
        System.out.printf("total price is %.2f%n",totalPrice);













           }
        }




