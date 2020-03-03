import java.util.*;
class Looping3 {
  public static void main(String [] args) {
    Scanner reader = new Scanner(System.in);
    String name;
    name = reader.nextLine();

    while (!name.equals("-1")) {
      System.out.println("Type in your name. Type -1 to exit");
      System.out.println("hello " + name);
      name = reader.nextLine();
      
      if (name.equals("Trevor")) {
        System.out.println("NIZE>");
      }
                       
      
    }
    System.out.println("exit");
           
           reader.close();
           }
}
