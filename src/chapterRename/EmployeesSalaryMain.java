package chapterRename;

import java.util.Scanner;

public class EmployeesSalaryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeesSalary clearPay = new EmployeesSalary();
        
        System.out.println("amount of hours");
        int workerHour= scanner.nextInt();
        clearPay.clearPay(workerHour);

        land();
    }
    public static void land(){
    int check =0;
        System.out.println(check);
    }

}
