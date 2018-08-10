//lesson 3
//https://www.youtube.com/watch?v=qZ2pb6BljLk&index=3&list=PLE7E8B7F4856C9B19
// http://www.newthinktank.com/2011/12/java-video-tutorial-3/
public class ifswitch {
 public static void main(String[] args) {
	        // Creates a random number between 0 and 50
 int randomNumber = (int) (Math.random() * 50);

 // If randomNumber is less than 25 
 if (randomNumber < 25)  {
	   System.out.println("The random number is less than 25");
  }else if (randomNumber > 25) {  // If randomNumber wasn't less than 25 
	   System.out.println("The random number is greater than 25");
   }else if (randomNumber == 25)  {  // Checks if randomNumber equals 25
	   System.out.println("The random number is equal to 25");
	  }

 // Prints out the random number
 System.out.println("The random number is " + randomNumber); 
 
 /****** Logical Operators:
  
 * ! : Converts the boolean value to its right to its opposite form ie. true to false
 * & : Returns true if boolean value on the right and left are both true 
 *            (Always evaluates both boolean values)  
 * && : Returns true if boolean value on the right and left are both true
 *           (Stops evaluating after first false)
 * | : Returns true if either boolean value on the right or left are true 
 *            (Always evaluates both boolean values)
 * || : Returns true if either boolean value on the right or left are true 
 *              (Stops evaluating after first true)
 * ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
*/
 if  ((true)&&(false))    {// never true
     System.out.println("\nBoth are true");
  }
 
  
 
 if (!(false)) {
   System.out.println("I turned false into true");
 }
 
 if ((true) ^ (false))   {
  System.out.println("\n1 is true and the other false");
    }
 
 int valueOne = 1;
 int valueTwo = 2;
 // The Conditional or Ternary Operator assigns one or another value based on a condition
 // If true valueOne is assigned to biggestValue. If not valueTwo is assigned
  int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
  System.out.println(biggestValue + " is the biggest\n");
 char theGrade = 'B';
 
 switch (theGrade) {
    case 'A':
      System.out.println("Great Job");
      break; // Ends the switch statement
    case 'b': // You can use multiple case statements in a row
    case 'B':
      System.out.println("Good Job, get an A next time");
      break;
    case 'C':
      System.out.println("OK, but you can do better");
      break;
    case 'D':
       System.out.println("You must work harder");
       break;
   default:
       System.out.println("You failed");
       break;
 }
   int count; 
   for(count = 0; count < 5; count = count+1) 
	   System.out.println("This is count: " + count); 
   System.out.println("Done!");
 
 
 }
}