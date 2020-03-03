import java.util.*;
class Nim {
  public static void main(String [] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Player 1, Type in your username:");
    String player1 = reader.nextLine();
    System.out.println(player1);
    System.out.println("Player 2, Type in your username:");
    String player2 = reader.nextLine();
    System.out.println(player2);
    int randomInteger = random.nextInt(10);// replace with random integer
    System.out.println(randomInteger);
    reader.close();
  }
}