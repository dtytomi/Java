import java.util.Scanner;

public class Decrypt {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int count = 0, firstValue = 0, secondValue = 0, thirdValue = 0, fourthValue = 0;

        System.out.println("Input values and press the return key after each input:  \n");

        while(count < 4 ) {

            int decrypt = input.nextInt();

            int actualValue = decrypt + 10;

            if (actualValue > 16){
                actualValue = decrypt;
            }

            int subtracted = actualValue - 7;
            
            switch(count) {

                case 0: thirdValue = subtracted;
                        break;

                case 1: fourthValue = subtracted;
                        break;

                case 2: firstValue = subtracted;
                        break;

                case 3: secondValue = subtracted;
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
