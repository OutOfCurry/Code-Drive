import java.util.*;
class Selection2 {
  public static void main(String [] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type in your name:");
    String name = reader.nextLine();
    /* An if statement follows the form
     * if (Conditions) {
     * Random code
     * }
     * */
    // Remember that if statements only execute when the condition is true and they are skilled if false
    System.out.println("Type your mark:");
    int mark = reader.nextInt();
    if ((mark > 50) && !name.equals("Srinjoy")) {
      System.out.println("Passed " + name);
    }
    // Else stattements are
    else if ((mark > 40) || name.equals("Nithursan")) {
      System.out.println("You almost made it.");
    }
    else if (mark > 80 && mark <90 && name.equals("Ish")) {
      System.out.println("Try harder");
    }
    else { 
      System.out.println("You failed");
    }
  }
}