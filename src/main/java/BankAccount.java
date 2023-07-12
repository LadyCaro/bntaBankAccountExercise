public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;


    public BankAccount(){
        this.firstName = "Carolina";
        this.lastName = "Horman";
        this.dateOfBirth = "12.08.2000";
        this.accountNumber = 123456789;
        this.balance = 0;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String firstName){
        this.lastName = lastName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(){
        this.balance = balance;
    }

    public void deposit(int addAmount){
        this.balance += addAmount;
    }

    public void withdrawal(int removeAmount){
        this.balance -= removeAmount;
    }

    public void interest(double interestAmount){
        this.balance *= interestAmount;
    }

}
