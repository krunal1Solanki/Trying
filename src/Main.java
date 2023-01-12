import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Your Password : ");
        String pass = sc.next();
        SBIUser user = new SBIUser(name, pass);
        System.out.println(user.deposit(1000));
        System.out.println(user.withdraw(200, pass));
        System.out.println(user.checkBalance());
    }
}