import java.util.*;
class counter {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int mark;
    int totaltest = 5;
    int sum =0; //accumulator
    for(int i =0; i < 5; i++) {
      mark = reader.nextInt();
      sum = sum+mark;
    }
    double avg = 1.0*sum/totaltest;
    System.out.println(avg);
  }
}