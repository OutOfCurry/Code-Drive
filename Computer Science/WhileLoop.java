import java.util.*;
class WhileLoop {// these loops execute until the condition is met
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int mark = reader.nextInt();
    int Count = 0;//COunter
    while (mark<= 50) {
      System.out.println("Try again");
      mark = reader.nextInt();
      Count++;
    }
    System.out.println("Congrats!" + Count);
  }
}