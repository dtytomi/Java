import java.util.Map;
import java.util.*;
import java.util.Scanner;


class CollapseRaw {

  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Input String ");

      String userInput = input.nextLine();

      String[] removeSpaces = userInput.split(" ");
      
      collapseString(removeSpaces);
  }


  public static void collapseString(String letter[]) {
 
    int count = 0, prev = 0, curr = 0, currentIndex = 0, later = 0;
    String result = "";


    //Process char

    for (int i = 0, j = 0; i < letter.length; j = i + 1, i++ ) {

        curr = Integer.parseInt(letter[i]);
        String agrregate = null;

        System.out.println("We: " +  j );

        if ( prev !=  curr ) {
          count = 1;
        }

        if ( curr == prev ) {
          count++;
        }  

        if ( curr !=  prev && count == 1) {
          agrregate = Integer.toString(curr) + ", " + Integer.toString(count);
          result = result + "  " + agrregate;
        } 

        if ( prev == curr   && count > 1 ) {
          agrregate = Integer.toString(curr) + ", " + Integer.toString(count);
          result = result + "  " + agrregate;
        }  
    
        prev = curr;

    }
    System.out.println();   
    System.out.println("Result: " +  result );
  }

}
