import java.util.Scanner;

public class ComparisonIfStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1000: ");
        int number1 = input.nextInt();

        System.out.print("2000: ");
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.printf("%d ==%d%n", number1, number2);
        }
        if (number1 != number2) {
            System.out.printf("%d ! = %d%n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d < %d%n",number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }
        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }


        System.out.printf("int 1000 ");
        System.out.printf("int 2000");

        String equality = "num 1000<= num 2000 ";
        return;


    }


    }

