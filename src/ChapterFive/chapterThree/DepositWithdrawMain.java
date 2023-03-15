package ChapterFive.chapterThree;

import java.util.Scanner;

public class DepositWithdrawMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountDepositMain accountDepositMain = new AccountDepositMain();



        System.out.println("enter amount to deposit");
        int money = scanner.nextInt();
        accountDepositMain.amountDeposit(money);
        System.out.println("availble balance "+accountDepositMain.viewBalance());
        System.out.println("enter withdrawer amount");
        int amount = scanner.nextInt();
        accountDepositMain.accountWithdraw(amount);

//        System.out.println(accountDepositMain.accountWithdraw(200));
        System.out.println("your balance is: " + accountDepositMain.viewBalance());





    }
}
