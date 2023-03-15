package tdd;

import bank.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    Bank gtBank;
    @BeforeEach
    public void setUp(){
        gtBank = new Bank("Guaranteed Trust Bank");
        gtBank.createAccountFor("Haneefah","1234");
    }

    @Test
    public void createAccount(){
        assertEquals(1,gtBank.countNumberOfAccount());
    }

    @Test
    public void checkBalanceOfNewAccountIsZero(){

    }

    @Test
    public int checkBalanceFor(){
        return 0;
    }

    @Test
    public void checkBalanceOfNewAccountIsZeroByDefaultTest(){
        assertEquals(0, gtBank.checkBalanceForNewAccountIsZero(1, "1234"));
    }
}
