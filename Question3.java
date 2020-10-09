import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
    
    
      Scanner scan = new Scanner(System.in);
      
      System.out.println(" Enter a radius pls! :");
      int num1 = scan.nextInt();
      
      System.out.println(num1 * (2*3.14) + " is the circumference");
      System.out.println("Area: " + (num1 * (2 * 3.14) * 2));

    }
}