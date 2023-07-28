import java.util.Random;
import java.util.Scanner;

class GenerateRandom {
    public static void main( String args[] ) {
    
        double play = 0 ;
     // Input Statement 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your playing number (1 to 10)");
        play = scan.nextDouble();

      Random rand = new Random(); 


      int upperbound = 10;
      
      
      int int_random = rand.nextInt(upperbound); 
     //Relationals
     if (play == int_random) {
     System.out.println("You Win!");
     } else {
     System.out.println("You Lose!");
     }

     if (play > upperbound) {
     System.out.println("Over the allowed limit!"); }

     if (play < 0) {
     System.out.println("Under the allowed limit!"); }

    } 

}
