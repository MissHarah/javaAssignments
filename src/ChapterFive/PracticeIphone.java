package ChapterFive;

public class PracticeIphone {
    private static String colour;
    private final static double price = 699.9;

    public static String getColour() {
        setColour("white");


        return colour;
    }

    public static void setColour(String colour) {
//              getColour();
         PracticeIphone.colour = colour;
    }

    public  double getprice() {

        return price;
    }
}
