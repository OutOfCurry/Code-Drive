/*
Nim Game
Author: Nithursan
Teacher: Mr.Ho
Assignment: Nim Game
*//
  
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
    
    // Game Initiation
    System.out.println(player1 + " Pick a pile to remove a number from:");
    //prints out piles
    System.out.println("A:" + A + " " + "B:" + B +" " + "C:" + C);
    // User Input for Pile chooser
    String pile = reader.nextLine();
    
    // If Pile A is entered
    if (pile.equals("A")) {
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
    else if (pile.equals("B")) {
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
    else if (pile.equals("C")) {
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
    
    reader.close();
    
  }
}
