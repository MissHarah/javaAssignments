package ChapterFive.chapterThree;

public class AccountDepositMain {

    private String accountName;
    private int balance;


    public void setName(String name) {
        this.accountName = name;

    }

    public String getAccountName() {

        return accountName;
    }

    public String accountWithdraw(int amountWithdraw) {
        if (amountWithdraw < 0) {
            return " insufficient Amount ";
        } else {
            this.balance -= amountWithdraw;

        }
        return "withdraw successful";
    }

    public int viewBalance() {

        return balance;
    }

    public String amountDeposit(int amountDeposit) {
        if (amountDeposit < 0) {
            return "incorrect transaction";
        } else {
            this.balance += amountDeposit;

            return "transaction successful";
        }
    }

}
