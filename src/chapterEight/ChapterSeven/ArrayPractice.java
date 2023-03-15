package chapterEight.ChapterSeven;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String[] colours = new String[7];
try {
    colours[0] = "Red";
    colours[1] = "Orange";
    colours[2] = "Yellow";
    colours[3] = "Green";
    colours[4] = "Blue";
    colours[5] = "Indigo";
    colours[6] = "Violet";
    colours[7] = "black";
}catch (ArrayIndexOutOfBoundsException e){
    e.printStackTrace();
    System.out.println(e.getMessage());
//    e.getMessage();
//    System.out.println(e.getMessage());
}

        for (String colour : colours){
            System.out.println(colour);

//        for (int i = 0; i < colours.length; i++) {
//            System.out.println(colours[i]);
        }
      String colourArrays =  Arrays.toString(colours);
        System.out.println(colourArrays);
    }
}