import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private  String name;
    private String accountNumber;
    private double balance;
    private String password;
    private int ROI;

    public SBIUser(String name, String password) {
        this.name = name;
        this.balance = balance = 500;
        this.password = password;
        this.ROI = 5;
        this.accountNumber = UUID.randomUUID() + "";
        System.out.println("Congratulations For Opening Account, Your Account Number is : " + this.accountNumber);
    }

    @Override
    public String withdraw(int amount, String password) {
        if(!Objects.equals(password, this.password))
                return "Invalid Password";
        if(amount <= balance) {
            balance -= amount;
            return "Successfully Withdrawn !" + " Remaining balance : " + balance;
        } else {
            return  "Insufficient Money !";
        }
    }

    @Override
    public String deposit(int amount) {
        balance += amount;
        return  "Successfully Deposited !" + " Total balance : " + balance;
    }

    @Override
    public String checkBalance() {
        return "Total Balance " +balance;
    }
}
