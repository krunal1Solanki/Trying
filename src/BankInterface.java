
public interface BankInterface {
    String withdraw(int amount, String password);
    String deposit(int amount);
    String checkBalance();
}
