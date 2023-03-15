package chapterEight.ChapterSeven;

//public class ArrayVariableArgument {
//    public static int sumNumbers(int ...numbers){
//        int total=0;
//        for (int number: numbers){
//            total += number;
//        }
//        return total;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sumNumbers(1,3,4,5,6,7,8,8,3,4,5,88));
//    }
//}

class Main{
    public static void main(String[] args) {
        System.out.println("Command-Line arguments are");

        for(String str: args){
            System.out.println(str);
        }

    }
}
