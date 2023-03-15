package chapterEight.ChapterSeven;

import java.util.Arrays;

public class GradeBookWith1DArrayMain {
    public static void main(String[] args) {
        int[] array = {20,30,12,15};
        GradeBookWith1DArray gradeBookWith1DArray =new GradeBookWith1DArray(array,"human physiology");

        System.out.println("");
        System.out.println("Course: " + gradeBookWith1DArray.getCourseName());
//        gradeBookWith1DArray.processGrades();
        System.out.println("Students grade: "+ Arrays.toString(gradeBookWith1DArray.getGrades()));
        System.out.println("Minimum "+" Maximum "+" Average ");
        System.out.println(gradeBookWith1DArray.getMinimum(array) + "       " + gradeBookWith1DArray.getMaximum(array)+"       " + gradeBookWith1DArray.getAverage(array));
//        System.out.println(gradeBookWith1DArray.getAverage(array));
    }
}
