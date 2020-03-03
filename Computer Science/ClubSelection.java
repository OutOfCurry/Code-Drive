/*Tech                      Public Speaking          Sport/well being          STEM
 * Comtech Club     Public Speaking Club    A mile a miracle       Math Club
 * Robotics Club      Toastmasters                Athletic Council        Engineering club
 * Technovation       Speak to me                Relay for Life             Chemistry Contest Club
 * Computer Club    Youth Alive                   Well being club        Science Club
 * Digital Media Club                                                                     Science Tutors
 * */
import java.util.*;
class ClubSelection {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); //use of scanner
    System.out.println("Type your name:");
    String name = reader.nextLine(); // name input
    String q1 = ("1. Technology");
    String q2 = ("2. Projecting your voice");
    String q3 = ("3. Physical / Well-being");
    String q4 = ("4. School subjects involving the sciences/maths");
    System.out.println(name); // name print
    System.out.println("What number are you interested in?");
    System.out.println(q1);
    System.out.println(q2);
    System.out.println(q3);
    System.out.println(q4);
    int answer = reader.nextInt();
    // answer 1
    if (answer == 1) {
    System.out.
      println(name + ", you picked " + q1);
   // System.out.print(answer);
    }
    
    else if (answer == 2) {
    System.out.
      println(name + ", you picked " + q2);
    }
    
    else if (answer == 3) {
    System.out.
      println(name + ", you picked " + q3);
    }
    
    else if (answer == 4) {
    System.out.
      println(name + ", you picked " + q4 + ".");
    }
    
    else { 
      System.out.println("Invalid.");
    }
    // answer 2
    System.out.println("Which number do you prefer to do in your past time?");
    System.out.println("1. Digital Interactions");
    System.out.println("2.Conversing to others about ideas. ");
    System.out.println("3. Physical Activity");
    System.out.println("4. Studying");
    int answer2 = reader.nextInt();
    
    if (answer2 == 1) {
      System.out.println(name + ", you picked: " + "Digital Interactions");
    }
    
     else if (answer2 == 2) {
      System.out.println(name + ", you picked: " + "Conversing to others about ideas.");
    }
     
      else if (answer2 == 3) {
      System.out.println(name + ", you picked: " + " Physical Activity");
    }
       else if (answer2 == 4) {
      System.out.println(name + ", you picked: " + " Studying");
    }
       else{
         System.out.println("Invalid");
  }
    System.out.println(" What number is your favourite subject:");
    System.out.println
reader.close();
}
}