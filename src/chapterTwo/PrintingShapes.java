package chapterTwo;

public class PrintingShapes {
    public static void main(String[] args) {

//         int[]numbers = {2, 3, 4, 5, 8};
//        System.out.println(pattern(numbers));
//        System.out.println("*****************");
//        System.out.println("*               *");
//        System.out.println("*               *");
//        System.out.println("*               *");
//        System.out.println("*               *");
//        System.out.println("*               *");
//        System.out.println("*               *");
//        System.out.println("*               *");
//        System.out.println("*               *");
//        System.out.println("*****************");
//
//        System.out.println("    ***    ");
//        System.out.println("   *   *   ");
//        System.out.println("  *     *  ");
//        System.out.println("  *     *  ");
//        System.out.println("  *     *  ");
//        System.out.println("  *     *  ");
//        System.out.println("   *   *   ");
//        System.out.println("    ***    ");
//        System.out.println();
//
//        System.out.println("      *     ");
//        System.out.println("     ***    ");
//        System.out.println("    *****   ");
//        System.out.println("      *     ");
//        System.out.println("      *     ");
//        System.out.println("      *     ");
//        System.out.println("      *     ");
//        System.out.println("      *     ");
//        System.out.println("      *     ");
//        System.out.println();
//
//        System.out.println("       *      ");
//        System.out.println("      * *     ");
//        System.out.println("    *     *   ");
//        System.out.println("  *         *  ");
//        System.out.println(" *           *  ");
//        System.out.println("  *         *  ");
//        System.out.println("   *       *   ");
//        System.out.println("    *     *    ");
//        System.out.println("     *   *     ");
//        System.out.println("       *       ");
//        System.out.println();



    }
    public static boolean pattern(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j - i < numbers.length; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        return false;
    }
}



//          int length = 10;
//     for (int row = 0; row < length; row++){
//
//        }
//         for (int col = 0; col <= row; col++){
//        sout("* ");
//        }
//
//     for (int col = row; col < length; col++){
//        sout(" ");



