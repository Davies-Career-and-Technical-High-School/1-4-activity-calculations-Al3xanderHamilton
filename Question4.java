import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {

        /* Write your code here */
    
    
      Scanner scan = new Scanner(System.in);
      
      System.out.println(" Enter How much the item cost: ");
      int num1 = scan.nextInt();
      int x = 20; 
      
      System.out.println("Change from $20: " + "$" + (x - num1) + " Is what you have left.");
    }
}