/*
Nim Game
Author: Nithursan
Teacher: Mr.Ho
Assignment: Nim Game
*/
  
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
  
    while (true) {
    // Game Initiation
    System.out.println(player1 + " Pick a pile:");
    //prints out piles
    System.out.println("A:" + A + " " + "B:" + B +" " + "C:" + C);
     System.out.println("Type the number According to its pile | A = 1 , B = 2 , C = 3");
    // User Input for Pile chooser
    int pile = reader.nextInt();
    if (A == 0 && B == 0 && C == 0) {
      break;
    }
    // If Pile A is entered
    if (pile == 1) {
      System.out.println("Pick a number to remove from Pile A");
      int removenum = reader.nextInt();
         if (removenum <= A) {
           A = (A - removenum);
      System.out.println("A: " + A + " B:" + B + " C:" + C);
         }
         else {
         System.out.println("Invalid.");
         }}
    
    // If Pile B is Entered
    else if (pile == 2) {
      System.out.println("Pick a number to remove from Pile B: ");
      int removenum = reader.nextInt();
      if (removenum <= B) {
        B = (B - removenum);
         System.out.println("A: " + A + " B:" + B + " C:" + C);
      }
      else {
        System.out.println("Invalid.");
      }}
    
    // If Pile C is entered
    else if (pile == 3) {
      System.out.println("Pick a number to remove from Pile C: ");
      int removenum = reader.nextInt();
      if (removenum <= C) {
        C = (C - removenum);
         System.out.println("A: " + A + " B:" + B + " C:" + C);
      }
      else {
        System.out.println("Invalid.");
      }}
    
    // Player 2s turn
    System.out.println(player2 + " Pick a pile to remove a number from:");
    System.out.println("A:" + A + " " + "B:" + B +" " + "C:" + C);//prints out piles
    System.out.println("Type the number According to its pile | A = 1 , B = 2 , C = 3");
    
    // fixing the scanner bug 
    int pile2 = reader.nextInt();
    
    // If Pile A is entered
    if (pile2 == 1) {
      System.out.println("Pick a number to remove from Pile A");
      int removenum = reader.nextInt();
         if (removenum <= A) {
           A = (A - removenum);
      System.out.println("A: " + A + " B:" + B + " C:" + C);
         }
         else {
         System.out.println("Invalid.");
         }}
    
    // If Pile B is Entered
    else if (pile2 == 2) {
      System.out.println("Pick a number to remove from Pile B: ");
      int removenum = reader.nextInt();
      if (removenum <= B) {
        B = (B - removenum);
         System.out.println("A: " + A + " B:" + B + " C:" + C);
      }
      else {
        System.out.println("Invalid.");
      }}
    
    // If Pile C is entered
    else if (pile2 == 3) {
      System.out.println("Pick a number to remove from Pile C: ");
      int removenum = reader.nextInt();
      if (removenum <= C) {
        C = (C - removenum);
         System.out.println("A: " + A + " B:" + B + " C:" + C);
      }
      else {
        System.out.println("Invalid.");
      }
    }
    else if ((A == 0) && (B == 0) && (C == 0)) {
      break;
    }
    
 
    }
    
  }
}

