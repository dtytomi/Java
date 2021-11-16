package dty.ui;

import java.text.NumberFormat;
import dty.calculators.Financial;

public class Main {
    
    public static void main (String[] args) {
    
        //displayLine a welcome message
        Console.displayLine("Welcome to the Future Value Calculator");
        Console.displayLine();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            
            // get input from user
            double monthlyInvestment = 
                Console.getDouble("Enter monthly investment:    ");

            double yearlyInterestRate =
                Console.getDouble("Enter yearly interest rate:    ");

            int year =
                Console.getInt("Enter number of years:        ");

            // call the future value method
            double futureValue = Financial.calculateFutureValue(
                    monthlyInvestment, yearlyInterestRate, year);

            // format and displayLine the result
            Console.displayLine("Future value:              " + 
                    NumberFormat.getCurrencyInstance().format(futureValue));

            // see if  the user wants to continue
            Console.displayLine();
            choice = Console.getString("Continue? (y / n):  ");
            Console.displayLine();
        }

        Console.displayLine("Bye!");
    }

}
