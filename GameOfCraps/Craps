/*
 * Craps is a dice game in which the players make wagers on the outcome of the roll, or a series of rolls, of a pair of dice. 
 * Program plays 1000 games of craps and displays winning and losing statistics. 
 */ 

import java.util.Random;
    public class Craps{
    
   // create random number generator for use in method rollDice
   private static Random randomNumbers = new Random(); 

   // enumeration with constants that represent the game status
   private enum Status { CONTINUE, WON, LOST };

   /* Declare array to store the number of games won by number of rolls in the game */
   int[] gamesWonRoll; 
   
   /* Declare array to store the number of games lost by number of rolls in the game */
   int[] gamesLostRoll;
   
   int winSum = 0; // total number of wins
   int loseSum = 0; // total number of losses
   int totalGames = 0;
   int length;
   
   int RollsToWin;
   int RollsToLose;
   
    /* Create the array to store the number of games won */
      int[] gamesWon = new int[22];
      /* Create the array to store the number of games lost */
      int[] gamesLost = new int[22];
   
   // plays one game of craps
  public void play()
   {
      int sumOfDice = 0; // sum of the dice
      int myPoint = 0; // point if no win or loss on first roll
      
      Status gameStatus; // can contain CONTINUE, WON or LOST

      int roll; // number of rolls for the current game      

     

      for ( int i = 1; i <= 1000; i++ )
      {
         sumOfDice = rollDice(); // first roll of the dice
         roll = 1;

         // determine game status and point based on sumOfDice
         switch ( sumOfDice ) 
         {
            case 7:  // win with 7 on first roll
            case 11: // win with 11 on first roll
               gameStatus = Status.WON;
               break;
            case 2:  // lose with 2 on first roll
            case 3:  // lose with 3 on first roll
            case 12: // lose with 12 on first roll
               gameStatus = Status.LOST;
               break;
            default: // did not win or lose, so remember point
               gameStatus = Status.CONTINUE; // game is not over
               myPoint = sumOfDice; // store the point
               break; // optional for default case at end of switch
         } // end switch 

         // while game is not complete ...
         while ( gameStatus == Status.CONTINUE ) 
         { 
            sumOfDice = rollDice(); // roll dice again
            roll++;

            // determine game status
            if ( sumOfDice == myPoint ) // win by making point
               gameStatus = Status.WON;
            else if ( sumOfDice == 7 ) // lose by rolling 7 
               gameStatus = Status.LOST;
         } // end while 
         
         // all roll results after 20th roll placed in last element
         /* Write an if statement to test whether the number of rolls is greater than
            21 and, if true, set number of rolls to 21 */
            if(roll > 21){
            roll = 21; 
            if(gameStatus == Status.WON){
            gamesWon[21] += 1; 
           } 
           
           if(gameStatus == Status.LOST){
            gamesLost[21] += 1;
            }
        }
            
            
           
         
         // increment number of wins in that roll
         if ( gameStatus == Status.WON )
         {
            /* Write code to increment the number of games won for a 
               specific number of rolls */
               gamesWon[roll] ++;
               
            /* Write code to increment the overall number of games won */
            winSum ++;
         } // end if
         else // increment number of losses in that roll
         {
            /* Write code to increment the number of games lost for a 
               specific number of rolls */
               gamesLost[roll] ++;
            /* Write code to increment the overall number of games lost */
            loseSum ++;
         } // end else
      } // end for
      
      printStats();
   } // end method play

   // print win/loss statistics
   public void printStats()
   {
      int totalGames = winSum + loseSum; // total number of games
      int length = 0; // total length of the games
      
      // display number of wins and losses on all rolls
      for ( int i = 1; i <= 21; i++ )
      {
         /* Write an if statement to test whether i is equal to 21 */
         if( i == 21){
         System.out.printf("%d games won and %d games lost on rolls after the 20th roll%n", 
         gamesWon[i], gamesLost[i]);
            /* Output number of games won and lost after the 20th roll */
        }else{
            /* Output number of games won and lost after each roll less than 20 */
         System.out.printf("%d games won and %d games lost on roll #%d%n",gamesWon[i],gamesLost[i],i);
        }

        
         
         // add number of wins by number of rolls needed to win
         RollsToWin += (gamesWon[i] * i);
         // add number of losses by number of rolls needed to lose
         RollsToLose += (gamesLost[i] * i); 
         
          // calculate total number of rolls to win/lose all games
         int allRolls = RollsToWin + RollsToLose;
         
         /* Write code to calculate total length of games */
         length = allRolls;
      } // end for
          totalGames = winSum + loseSum; 
      // calculate chances of winning
      System.out.printf( "\n%s %d / %d = %.2f%%\n",
         "The chances of winning are", winSum, totalGames,
         ( 100.0 * winSum / totalGames ) );


      System.out.printf( "The average game length is %.2f rolls.\n",
         ( ( double ) length / totalGames ) );
   } // end method printStats
   
   // roll dice, calculate sum and display results
   public int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt( 6 );  
      int die2 = 1 + randomNumbers.nextInt( 6 );  
      int sum = die1 + die2; // sum die values

      return sum; // return sum of dice
   } // end method rollDice
   
   
} // end class Craps
