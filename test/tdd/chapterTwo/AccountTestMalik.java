package tdd.chapterTwo;

import chapterTwo.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTestMalik<check> {


    @Test
    public void depositMoneyTest() {
        //given that malik has an account
        Account malikAccount = new Account();
        //when malik deposits 23
        malikAccount.deposit(23);
        //check that the balance is 23
        double balance = malikAccount.getBalance();
        assertEquals(23, balance);
    }


    @Test
    public void depositTwiceTest() {
        // given malik has an account
        Account malikAccount = new Account();
        //  given there is 300 in the account;
        malikAccount.deposit(300);
        double balance = malikAccount.getBalance();
        assertEquals(300, balance);

        // when i try to deposit 200;
        malikAccount.deposit(200);

        //check that balance is 500;
        balance = malikAccount.getBalance();
        assertEquals(500, balance);


    }


    @Test
    public void depositNegativeTest() {
        // giving I have an account with zero balance;
        Account malikAccount = new Account();
        //when I try to deposit negative amount ( -2300);
        malikAccount.deposit(-2300);
        //check that balance is zero

        double balance = malikAccount.getBalance();
        assertEquals(0, balance);

    }

    @Test
    public void withdrawalTest() {
        //giving that malik has an account;
        Account malikAccount = new Account();
        // when malik deposit 4000;
        malikAccount.deposit(4000);
        // when malik went to withdraw 4000
        //check that
        // malikAccount balance ();
        double balance = malikAccount.getBalance();
        assertEquals(0, balance);

    }
}
