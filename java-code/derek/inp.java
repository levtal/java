import java.util.Scanner;
import javax.swing.*; 




 public class inp    {
    public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in); //Anoter way to  read 
		System.out.print("Enter first number : "); 
		int a = input.nextInt();
		System.out.print("Enter second number: "); 
		int b = input.nextInt();
		System.out.print("Enter last number : ");
		int c = input.nextInt(); 
		System.out.println("Average is " + (a+b+c)/3);
		
		
		// The same ide with  swing
		String temp; // Temporary storage for input.
		temp = JOptionPane.showInputDialog(null, "First number"); 
		int a1 = Integer.parseInt(temp); // String to int
		temp = JOptionPane.showInputDialog(null, "Second number"); 
		int b1 = Integer.parseInt(temp); 
		temp = JOptionPane.showInputDialog(null, "Third number");
		int c1 = Integer.parseInt(temp); 
		JOptionPane.showMessageDialog(null, "Average is " + (a1+b1+c1)/3);
		
		
	}
  } 
  