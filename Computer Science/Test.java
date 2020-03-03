import java.util.Scanner;
class examples {
  public static void main(String[] args) {
    while(true){
    Scanner reader = new Scanner(System.in);
    System.out.println("How tall are you?");
    int height = reader.nextInt();  // input code
     if (height <= 0)
    { System.out.println("Invalid Height!"); }
    if (height < 120)
    { System.out.println("You are short"); }
    if (height > 180)
    { System.out.println("You are Tall"); }
    }
  }}