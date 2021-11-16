import java.util.Scanner;


public class Addition {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number");
        int number1 = input.nextInt();

        System.out.print("Enter the second number");
        int number2 = input.nextInt();
        

        int sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
    
    }

}
