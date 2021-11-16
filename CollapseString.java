import java.util.Scanner;
import java.util.List;
import java.util.Collection;
import java.util.HashMap; 
import java.util.Map; 
import java.util.*;

class CollapseString {

    static final int MAX_CHAR = 256;

    public static void main(String[] args) {
        
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Input String");

        String userInput = myInput.nextLine();

        String[] removeWhiteSpaces = userInput.split(" ");

        System.out.println("Number of occurence: ");
        reduceInputString(removeWhiteSpaces);

    }

    public static void reduceInputString(String values[]) {

        HashMap<String, Integer> my_map = new HashMap<String, Integer>();

        for (String c : values){

          if (my_map.containsKey(c)){
            my_map.put(c, my_map.get(c) + 1);
          } 
          else {
            my_map.put(c, 1);
          }
        }
        for (Map.Entry entry : my_map.entrySet()){
           System.out.print(entry.getKey() + ", " + entry.getValue() + " ");
        }
    }
}
