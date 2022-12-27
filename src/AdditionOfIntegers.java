import java.util.Scanner;

public class AdditionOfIntegers {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System. in);


        System.out.print("int num1");

        int number1 = input.nextInt();

        System.out.println("int num2");

        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.printf("sum is %d%n", sum);


    }
}
