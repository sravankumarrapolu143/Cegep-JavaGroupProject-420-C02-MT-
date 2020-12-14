/**
* <h1>Guess Number Java Program</h1>
* The Guess Number Java program implements an application that
* requires an Guessing Input from user and match the random Number " .
* <p>
*
* @author  Sahil, Kartik, Krinesh, Gurvinder,Rapolu Sravan Kumar
* @version 1.0
* @since   2020-03-10
*/



import java.util.*;
import java.util.concurrent.TimeUnit;

public class GuessNumber {

    /**
   * This is the main method which matches the Guess Number entered by user.
   * @param args Number.
   * @return Print Statement Whether the Number Guesses is true or False.
   * @exception IOException On input error.
   * @see IOException
   */
    
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
       // Total Rounds In Game
       int ROUNDS = 3;
       int RoundWin = 0;
       int count = 1;

        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 5 trials and three rounds");
        while (count <= ROUNDS) {
         // // Given turn trials
        int turns  = 5;
        int NUMBER = 1 + (int)(100
                               * Math.random());
        System.out.println("ROUND "+count);
        //final int NUMBER = r.nextInt(100);
        while(turns != -1) {




            if(turns == 0){
                System.out.println("Oops You're out of turns !! Correct Answer is " + NUMBER);
                break;
            }
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Enter the number between 1 and 100. You have " + turns + " turns left");
            int gNumber = s.nextInt();
           


            if(gNumber == NUMBER){
       
            	
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Congratulations! Correct Answer");
                ++RoundWin;
                break;
            }
            else if(gNumber > NUMBER){

                System.out.println("Wrong Answer! Try going lower");
                turns -= 1;
                TimeUnit.SECONDS.sleep(1);
                
            }
            else if(gNumber < NUMBER){

                System.out.println("Wrong Answer! Try going higher");
                turns -= 1;
                TimeUnit.SECONDS.sleep(1);
                
            }
            
        }

        ++count;
        }
       System.out.println("Game Over. Rounds Score "+RoundWin+" / "+ROUNDS);
        

    }
}
