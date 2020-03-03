// Typecasting
//Substring
import java.util.*;

class TypeCast {
  public static void main(String[] args) {
    while (true) {
    Scanner reader = new Scanner(System.in);
    
    System.out.println("Type in your age:");
    String age = reader.nextLine();
    System.out.println(age);
    
    // The goal is to compare the variable age to the integer 18
    // To do this, we must change the datatype of the iage into an integer
    // This is called TypeCasting
    // Typecasting in java is not commmon and can cause problems in the future.
   // if age < 18) 
    
  int ageNum = Integer.parseInt(age); // changes string into integer
  //  System.out.println(ageNum + 1);
  if (ageNum < 18) {
    System.out.println("You a small child.");
  }
  else  {
    System.out.println("Big mon ting.");
  }
    reader.close();
  }
}
}