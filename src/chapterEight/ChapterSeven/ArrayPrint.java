package chapterEight.ChapterSeven;

public class ArrayPrint {
    public static void main(String[] args) {

        int[]numbers = {5,10,15,20,25,30,35,40,45,50};

        for (int i = 1; i< numbers.length; i+=2){
            System.out.println(numbers[i]);

            if (i%2!=0)continue;
            System.out.println(numbers[i] +" ");

            int count = 0;
            for (int number:numbers){
                boolean countIsOdd = count%2 !=0;
                if(countIsOdd);
                System.out.println(number);
                count++;
            }
        }
    }
}
