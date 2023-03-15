package tdd;

import bank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account;
    @BeforeEach
    public void setUp(){
        account = new Account(1, "Black Favour", "1234");
    }
    @Test
    public void depositTest(){
        account.deposit(1500);
        assertEquals(1500,account.checkBalance("23123"));

    }
    @Test
    public void checkBalanceWithWrongPinReturnsZeroTest(){
        account.deposit(1_500);
        assertEquals(0,account.checkBalance("2123"));
    }
    @Test
    public void withdrawMoneyTest(){
        account.deposit(8_000);
        account.withdraw(4_000, "1234");
      assertEquals(4000,account.checkBalance("1234"))  ;
    }

}
