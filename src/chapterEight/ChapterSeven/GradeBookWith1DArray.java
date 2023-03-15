package chapterEight.ChapterSeven;

public class GradeBookWith1DArray {
    private int[] grades;
    private String courseName;

    public GradeBookWith1DArray(int[] grades, String courseName){
        this.courseName = courseName;
        this.grades = grades;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }

    public int[] getGrades() {
        return grades;
    }

//    public void processGrades() {
////        getMaximum();
////        getMinimum();
////        getAverage();
//
//
//
//
//    int Average =0;
//        for (double average =0; average< grades.length;Average++){
//        average+=grades.length;
//    }

//}

    public double getAverage(int[] grades) {
        int sum = 0;
        for (int grade: grades) {
            sum+=grade;

        }
        double average = sum/grades.length;

        return average;
    }

    public int getMaximum(int[] grades) {
        int maximumGrade = 0;
        for (int grade = 0; grade < grades.length; grade++) {
//            the [grade] count what is in the index;
            if (grades[grade] > maximumGrade){
                maximumGrade = grades[grade];
            }
        }
        return maximumGrade;
    }

    public int getMinimum(int[] grades) {
        int lowestGrade = Integer.MAX_VALUE;
        for (int grade  = 0; grade< grades.length; grade ++) {
            if(grades[grade] < lowestGrade){
                lowestGrade = grades[grade];
            }
        }
        return lowestGrade;
    }
}
