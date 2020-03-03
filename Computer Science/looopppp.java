import java.util.*;
class looopppp {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int num;
    /*
    while (num>=1 && num <= 100) {
      num = reader.nextInt();
    }
    */
    do {
      num = reader.nextInt();
    } while (num>=1 && num <= 100); 
  }
}