package chapterEight.ChapterSeven;

import java.util.Arrays;

public class ArrayOfIntegersAssign {
    public static void main(String[] args) {
        int[] number = {2, 4, 6, 3, 5, 1};
        System.out.println(multiplyNumbers(number));
        System.out.println((Arrays.toString(ascendingOrder(number))));
        System.out.println(Arrays.toString(descendingOrder(number)));
    }

    public static int multiplyNumbers(int[] array) {
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            num = num * array[i];
        }
        return num;
    }


    public static int[] ascendingOrder(int[] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                int temp = 0;
                if (number[i] < number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }

            }

        }
        return number;
    }

    public static int[] descendingOrder(int[] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                int temp = 0;
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;

                }
            }
        }

        return number;
    }

}

//create a variable that is equal to 1;
//for loop that is < than the array length.
//multiply the initialized number with the arrays.