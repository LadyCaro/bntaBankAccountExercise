import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestBankAccount {

//    TEST SETTERS AND GETTERS
    BankAccount bankAccount;
    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Carolina", "Horman", "12.08.2000", 123456789);}

    @Test
    public void testGetFirstName(){
//        GIVEN (in @BeforeEach)
//        WHEN
        String result = bankAccount.getFirstName();
//        THEN
        String expected = "Carolina";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSetFirstName(){
//        Shorter way of writing:
        bankAccount.setFirstName("Carolina");
        assertThat(bankAccount.getFirstName()).isEqualTo("Carolina");
    }

    @Test
    public void testGetLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Horman");
    }

    @Test
    public void testSetLastName(){
//        GIVEN
        bankAccount.setLastName("Horman");
//        WHEN
        String result = bankAccount.getLastName();
//        THEN
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
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    public void testSetBalance(){
        bankAccount.setAccountNumber(0);
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

//    TEST DEPOSIT, WITHDRAWAL AND INTEREST
    @Test
    public void testDeposit(){
        bankAccount.deposit(100);
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }

    @Test
    public void testWithdrawal(){
//        GIVEN
        bankAccount.deposit(110);
        bankAccount.withdrawal(50);
//        WHEN
        int result = bankAccount.getBalance();
//        THEN
        int expected = 60;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testInterest(){
        bankAccount.deposit(100);
        bankAccount.interest(1.02);
        int result = bankAccount.getBalance();
        int expected = 102;
        assertThat(result).isEqualTo(expected);
    }

}