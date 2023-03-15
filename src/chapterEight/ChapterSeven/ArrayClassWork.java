package chapterEight.ChapterSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayClassWork {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("sanni");
//        names.add("Haneefah");
//        names.add("Ayoni");
//        names.add("Amusa");
//        names.add("AbdulRahman");
//        names.add("oyetunji");
//        for (String name:names){
//            System.out.println(name);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(numbers);

        for (int i = 0; i <numbers.size(); i++) {
            System.out.println(numbers.get(i));
            System.out.println();

        }
        }

    }

