import java.util.*;
class looping{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int answer = 5;
    System.out.println("Guess a number from 1-10:");
    for (int i = 0; i < 4; i++) {
      int guess = reader.nextInt();
        if (guess > 10 || guess < 0) {
          System.out.println("Invalid Guess.");
        }
        else if (guess < answer) {
          System.out.println("Too low");
        }
        else if (guess == answer) {
          System.out.println("Correct");
          //Jump Statements | Break commad terminates the loops that you are currently in
          break;
        }
        else {
          System.out.println("too high");
        }
    }
    reader.close();
  }
  }