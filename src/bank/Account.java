package bank;

public class Account {

    private int balance;
    private int account;
    private String pin;
    private String accountName;
    private int accountNumber;

    public Account(int accountNumber, String accountName, String accountPin) {
        this.accountName = accountName;
        this.pin = accountPin;
        this.account = accountNumber;
        this.accountNumber = accountNumber;
    }

    private boolean pinIsCorrect(String accountPin) {
        return this.pin.equals(accountPin);
    }

    private boolean amountIsNotGreaterThanAccountBalance(int amount) {
        return amount < balance;
    }

    public void deposit (int amount){
        balance += amount;
    }

    public int checkBalance (String pin){
        if (pinIsCorrect(pin)) {
            return balance;
        }
        return 0;
    }

    public void withdraw ( int amount, String pin){
        if (pinIsCorrect(pin)) balance -= amount;
    }
    public int getAccountNumber(){
       return accountNumber;
    }
}