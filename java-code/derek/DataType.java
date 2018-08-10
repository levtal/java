 
 class DataType 
  {
    public static void main(String args[]) 
	{ 
	     
		 int var; // this declares an int variable double 
		 
		 double x; // this declares a floating-point variable 
		 byte by;   //8-bit integer ranging from -128 to 127
		 short s;  //16-bit integer ranging from -32,768 to 32,768
		 long l;   //64-bit integer
		 float f;  //Single-precision floating point, 32-bit
		 char c;   //Character , 16-bit unsigned ranging from 0 to 65,536 (Unicode)
		 boolean bo = true; //Can be true or false only
		 var = 10; // assign var the value 10 
		 x = 10.0; // assign x the value 10.0 
		 //The ‘String’ type  is not a primitive data type. 
		 //strings (a sequence of characters) in Java are treated as Objects.
		 System.out.println("Original value of var: " + var);
		 System.out.println("Original value of x: " + x); 
		 System.out.println(); // print a blank line
		 // now, divide both by 4 var = var / 4; x = x / 4;
		 System.out.println("var after division: " + var); 
		 System.out.println("x after division: " + x);
		 
		 char ch; 
		 ch = 'X'; 
		 System.out.println("ch contains " + ch); 
		 ch++; // increment ch 
		 System.out.println("ch is now " + ch); 
		 ch = 90; // give ch the value Z 
		 System.out.println("ch is now " + ch);
		 
		 
		 boolean b; 
		 b = false; 
		 System.out.println("b is " + b); 
		 b = true; 
		        System.out.println("b is " + b); // a boolean value can control the if statement 
		 if(b) 
			    System.out.println("This is executed."); 
		 b = false; 
		 if(b) 
			 System.out.println("This is not executed.");  
		 System.out.println("10 > 9 is " + (10 > 9));
		 
		 
		 
	}
 }