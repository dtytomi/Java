import java.util.Scanner;


public class Encryption {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int count = 0;
        int firstValue = 0, secondValue = 0, thirdValue = 0, fourthValue = 0;
        
        System.out.println("Input values and press the return key after each input:  \n");

        while (count < 4) {
            
            int encrypt = input.nextInt();
            int  addition = encrypt + 7;
            int rem = addition % 10;
            
            switch(count) {
                case 0: thirdValue = rem;
                       break;

                case 1: fourthValue = rem;
                       break;

                case 2: firstValue = rem;
                        break;

                case 3: secondValue = rem;
                        break;
                                
            }
    
            count++;
        
        }

        System.out.printf(" %d", firstValue);
        System.out.printf(" %d", secondValue);
        System.out.printf(" %d", thirdValue);
        System.out.printf(" %d \n", fourthValue);
    
 }

}
