
//Substring
import java.util.*;

class Substring {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String sentence = "My age is 10988";
    
    String clip = sentence.substring(10);
    System.out.println(clip);
    // CHarAt alllows us to retrieve a particular character of a string
    // System.out.println(sentence.charAt(5));
    System.out.println("the sentence has this many characters: ");
    System.out.println(sentence.length());
    // length()) returns the number of characters in the string
    
    reader.close();
    }
  }

