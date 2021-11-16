import java.util.Scanner;


public class BMI {

    public static void main(String[] args) {
    
        Scanner input =  new Scanner(System.in);

        System.out.print("Application to calculate Ur BMI");

        System.out.println("\nInput Weight in Kg");
        int weightInKg = input.nextInt();
        
        System.out.println("Input Height in Meters");
        int heightInM = input.nextInt();

        int bmi = weightInKg / (heightInM * heightInM);

        System.out.printf("Ur BMI is:  %d%n", bmi);
    }
    
}
