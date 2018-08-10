//1-95
// https://www.youtube.com/watch?v=TBWX97e1E9g&index=1&list=PLE7E8B7F4856C9B19
// Create new java project name 'dk'
// from  dk/src create new file.
//  chose name  'Hellow1.java'

public class Hellow1 {
 
//public allows other classes to use this function
//static means that only a class can call for this function to execute
 
 
//Every main function must accept an array of string objects
//Class variables must start with static if you want to access them 
//	with any other methods in the class
static String randomString = "String to print";
//Constant variables are defined with the word final
static final double PINUM = 3.1415929;

public static void main(String[] args){
 
  System.out.println("Hello World");
 
 
 int integerOne = 22;
 int integerTwo = integerOne + 1; // This is an expression statement
  
 System.out.println(integerTwo);

          //Javas Primitive Types
 byte bigByte = 127; // Minimum value -128 Maximum value 127
 short bigShort = 32767; // Minimum value -32768 Maximum value 32767
int bigInt = 2147483647; // Minimum value -2147483648 Maximum value 2147483647
long bigLong = 9223372036854775807L; // Minimum value -9223372036854775808L
float bigFloat = 3.14F; // You must end a float with an F
double bigDouble = 3.1234567890D; // The D is not required with doubles
System.out.println(Float.MAX_VALUE); // Float is precise to 6 decimal places
System.out.println(Double.MAX_VALUE); // Double is precise to 15 decimal places
boolean trueOrFalse = true; // Booleans are True or False, not 1 or 0
//A char will accept a number or a character surrounded by apostrophes
char randomChar = 65; // Character Code for A is 65 Minimum value 0 Maximum value 65535
char anotherChar = 'A';
System.out.println(randomChar);
//chars can also contain escaped characters
char backSpace = '\b';
char formFeed = '\f';
char lineFeed = '\n';
char carriageReturn = '\r';
char horizontalTab = '\t';
char doubleQuote = '\"';
char singleQuote = '\'';
char backSlash = '\\';

//A string contains a series of characters
String randomString = "I'm just a random";
String anotherString = "string";
//You combine strings with a +
String combinedString = randomString + ' ' + anotherString;
System.out.println(combinedString);
//How to convert any other type to a string
String byteString = Byte.toString(bigByte);
String shortString = Short.toString(bigShort);
String intString = Integer.toString(bigInt);
String longString = Long.toString(bigLong);
String floatString = Float.toString(bigFloat);
String doubleString = Double.toString(bigDouble);
String booleanString = Boolean.toString(trueOrFalse);
String charString = Character.toString(randomChar); // You don't need to do this
System.out.println(charString);

// Can't do this because char is a primitive data type

// System.out.println(randomChar.getClass());
// You can do this because String is an object
  System.out.println(charString.getClass());

// You use casting to convert from one primitive type to another
// If you convert from a number that is to big the largest possible value
//  will be used instead

double aDoubleValue = 3.1456789;
int doubleToInt = (int) aDoubleValue;
System.out.println(doubleToInt);

/* To cast to other primitive types just proceed with the conversion to type
* ie (byte) (short) (long) (double)
* (float) & (boolean) & (char) don't work.
* (char) stays as a number instead of a character
*/

// Use parseInt to convert a string into an integer
int stringToInt = Integer.parseInt(intString);

/* Other parse functions
* parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean
* There is no reason to parse a Character
*/
 }

}


 
 