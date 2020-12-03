/**
* <h1>Guess Number Java Program</h1>
* The Guess Number Java program implements an application that
* requires an Guessing Input from user and match the random Number " .
* <p>
*
* @author  Sahil, Kartik,Krinesh,Gurvinder
* @version 1.0
* @since   2020-03-10
*/








import java.util.*;
import java.util.concurrent.TimeUnit;

public class GuessNumber {
    
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
         // Default Number Set is 5.
        int turns  = 5;
        final int NUMBER = r.nextInt(100);

        while(turns != -1) {

            if(turns == 0){
                System.out.println("Oops You're out of turns !! Correct Answer is " + NUMBER);
                break;
            }
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Enter the number between 1 and 100. You have " + turns + " turns left");
            int gNumber = s.nextInt();
            System.out.println("---------------------------------------------------------------------");


            if(gNumber == NUMBER){
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Congratulations! Correct Answer");
                break;
            }
            else if(gNumber > NUMBER){
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Wrong Answer! Try going lower");
                turns -= 1;
                TimeUnit.SECONDS.sleep(1);
                
            }
            else if(gNumber < NUMBER){
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Wrong Answer! Try going higher");
                turns -= 1;
                TimeUnit.SECONDS.sleep(1);
                
            }
            
        }
        

    }
}
