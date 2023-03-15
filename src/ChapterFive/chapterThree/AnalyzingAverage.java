package ChapterFive.chapterThree;

public class AnalyzingAverage {
    private String name;
    private double Average;


 public AnalyzingAverage(String name,double Average){
     this.name = name;
     this.Average =Average;
 }
 public void setName(String name) {

 }
     public String getName(){
     return name;
     }

 public double setAverage(double Average){
     if(Average <0.0){
 }
     if (Average >=100.0){
         this.Average =Average;
     }
 public double getAverage(){
     return Average;
 }

 public String getLetterGrade() {
         String letterGrade = "";
         if (Average >= 90.0) {
             letterGrade = "A";
         } else if (Average >= 80.0) {
             letterGrade = "B";
         } else if (Average >= 70.0) {
             letterGrade = "C";
         } else if (Average >= 60.0) {
             letterGrade = "D";
         } else {
             letterGrade = "F";
         }
     }
 }

}



