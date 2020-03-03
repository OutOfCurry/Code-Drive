// Ask the user for a password.  If password is correct, output “you are logged in” if not, then output “incorrect password” | Password: Happy
import java.util.*;
class Password { 
  public static void main(String[] args) {
    while (true) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type in your password");
    String password = reader.nextLine();
    String realPassword = ("Happy");
    if (realPassword == password)
    {
      System.out.println("Correct Password.");
    }
    else
    {
      System.out.println("Incorrect Password.");
    }
    }}}