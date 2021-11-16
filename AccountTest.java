import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Da Grin", 50.00);
        Account account2 = new Account("Olamide YBNL", 0.00);

        System.out.printf("account1 name is: %s%n%n", account1.getName());
        System.out.printf("account2 name is: %s%n%n", account2.getName());

        System.out.printf("%s balance name is: $%.2f%n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance name is: $%.2f%n%n", account2.getName(), account2.getBalance());
        
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();

        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);
    
        System.out.printf("%s balance name is: $%.2f%n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance name is: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); 
        depositAmount = input.nextDouble();
        
        System.out.printf("%nadding %.2f to account2  balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        
        System.out.printf("%s balance name is: $%.2f%n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance name is: $%.2f%n%n", account2.getName(), account2.getBalance());


    }

}
