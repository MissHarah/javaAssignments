
package chapterEight.ChapterSeven;

import org.junit.jupiter.api.Test;

public class ArrayIntoMethod {


    public static int sumArray(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
   }

   public static void main(String[] args) {
       int[] numbers = {1, 2, 3, 4, 5};
    int total = sumArray(numbers);
    System.out.println(total);

    }

}