import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input your first name: ");
        String firstName = input.nextLine();

        System.out.println("Input your last name: ");
        String lastName = input.nextLine();

        System.out.println("Input your Day of birth: ");
        int dayOfBirth = input.nextInt();

        System.out.println("Input your Month of birth: ");
        int monthOfBirth = input.nextInt();

        System.out.println("Input your Year of birth: ");
        int yearOfBirth = input.nextInt();
        
        HeartRates heartRate = new HeartRates(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);

        System.out.printf("%s %s your date of birth is: %s \nand your target heart rate is: %s\n",
                heartRate.getFirstName(), heartRate.getLastName(), 
                heartRate.getDOB(), heartRate.getHeartRates(yearOfBirth));
    } 
}

