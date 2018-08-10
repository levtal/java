 

public class Monstercall{
 public static void main (String[] args)	  {
	  	Monster Frank = new Monster();
		System.out.println(Frank.name);
	 
        Monster bol = new Monster();
		bol.name = "bolu";
		System.out.println(bol.name+ " has attack of " + bol.getAttack());
	 }
	    
	 
	
}