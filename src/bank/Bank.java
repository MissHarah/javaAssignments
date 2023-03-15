package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private int lastAccountNumberGenerated;
    private List<Account> accounts;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    public void createAccountFor(String accountName, String accountPin) {
        int accountNumber = generateAccountNumber();
        Account newAccount = new Account(accountNumber, accountName, accountPin);
        accounts.add(newAccount);
    }
    private  int generateAccountNumber(){
        return ++lastAccountNumberGenerated;
    }

    public int countNumberOfAccount(){
        return accounts.size();
    }

    public int checkBalanceForNewAccountIsZero(int accountNumber, String pin) {
        return 0;
    }

    public void deposit(String accountName, int pin){
}
    public void deposit(int amount, int accountNumber){
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        foundAccount.deposit(amount);
    }
    private Account findAccountByAccountNumber(int accountNumber) {
        for (Account account: accounts){
            boolean accountNumberMatches = account.getAccountNumber()==accountNumber;
            if(accountNumberMatches) return account;
        }
        return null;
    }
    public void transfer(int amount, int senderAccountNumber,int receiverAccountNumber, String senderPin){
        Account senderAccount = findAccountByAccountNumber(senderAccountNumber);
            Account receiverAccount = findAccountByAccountNumber(receiverAccountNumber);
            senderAccount.withdraw(amount, senderPin);
            receiverAccount.deposit(amount);
    }
}