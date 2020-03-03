import java.util.Scanner;

class Grades {
  public static void main(String[] args) {
    Scanner poop = new Scanner(System.in);
     int secretNumber = 90;
    // Taking in user input
    System.out.println("Guess a number");
    int guess = poop.nextInt();
    System.out.println("you guessed " + guess);
    
    if (guess > secretNumber) {
      System.out.println("Guess Smaller");}
    
    if (guess < secretNumber) {
      System.out.println("Guess Bigger");}
    
    else {
      System.out.println("You trash bruh, you got it wrong"); }
    poop.close();
  }}