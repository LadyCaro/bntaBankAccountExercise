import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestBankAccount {

    BankAccount bankAccount;
    @BeforeEach
    public void setUp() {bankAccount = new BankAccount();}

    @Test
    public void testGetFirstName(){
        String result = bankAccount.getFirstName();
        String expected = "Carolina";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetFirstName(){
        bankAccount.setFirstName("Carolina");
        String result = bankAccount.getFirstName();
        String expected = "Carolina";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetLastName(){
        String result = bankAccount.getLastName();
        String expected = "Horman";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetLastName(){
        bankAccount.setLastName("Horman");
        String result = bankAccount.getLastName();
        String expected = "Horman";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetDateOfBirth(){
        String result = bankAccount.getDateOfBirth();
        String expected = "12.08.2000";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetDateOfBirth(){
        bankAccount.setDateOfBirth("12.08.2000");
        String result = bankAccount.getDateOfBirth();
        String expected = "12.08.2000";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetAccountNumber(){
        int result = bankAccount.getAccountNumber();
        int expected = 123456789;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetAccountNumber(){
        bankAccount.setAccountNumber(123456789);
        int result = bankAccount.getAccountNumber();
        int expected = 123456789;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetBalance(){
        int result = bankAccount.getBalance();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetBalance(){
        bankAccount.setAccountNumber(0);
        int result = bankAccount.getBalance();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testDeposit(){
        bankAccount.deposit(100);
        int result = bankAccount.getBalance();
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testWithdrawal(){
        bankAccount.deposit(110);
        bankAccount.withdrawal(50);
        int result = bankAccount.getBalance();
        int expected = 60;
        assertThat(result).isEqualTo(expected);
    }

    public void testInterest(){
        bankAccount.deposit(100);
        bankAccount.interest(1.02);
        int result = bankAccount.getBalance();
        int expected = 102;
        assertThat(result).isEqualTo(expected);
    }

}