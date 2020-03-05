import java.util.*;
class Nim {
  public static void main(String [] args) {
    // Scanner Class
    Scanner reader = new Scanner(System.in);
    
    //Username Setup
    System.out.println("Player 1, Type in your username:");
    String player1 = reader.nextLine();
    System.out.println(player1);
    System.out.println("Player 2, Type in your username:");
    String player2 = reader.nextLine();
    System.out.println(player2);
    
    Random rand = new Random(); // random class creation
    //random int creation for each Pile
    int A = 1 + rand.nextInt(10);
    int B = 1 + rand.nextInt(10);
    int C = 1 + rand.nextInt(10); 
    
    System.out.println(player1 + " Pick a pile to remove a number from:");
    System.out.println("A:" + A + " " + "B:" + B +" " + "C:" + C);//prints out piles
    String pile = reader.nextLine();
    if (pile.equals("A")) {
      System.out.println("Pick a number to remove from Pile A");
   }
    int removenum = reader.nextInt();
     if (removenum <= A) {
      System.out.println("A: " + (A - removenum) + " B:" + B + " C:" + C);
  }
    if (pile.equals("B")) {
      System.out.println("Pick a number to remove from Pile B:");
}
      if (removenum <=B) {
      System.out.println("A: " + A + " B:" + (B - removenum)  + " C:" + C);
  }
     if (pile.equals("C")) {
      System.out.println("Pick a number to remove from Pile C:");
}
    if (removenum <=C); {
      System.out.println("A: " + A + " B:" + B + " C: " + (C - removenum));
  }
}
}