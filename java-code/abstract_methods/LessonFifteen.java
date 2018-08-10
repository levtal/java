//https://www.youtube.com/watch?v=1PPDoAKbaNA&index=15&list=PLE7E8B7F4856C9B19
 

public class LessonFifteen {
	
	public static void main(String[] args){
		
		Vehicle car = new Vehicle(4, 100.0);
		
		// Using methods from the interface Drivable
		System.out.println("Cars Max Speed: "+car.getSpeed());
		System.out.println("Cars Number of Wheels: "+car.getWheels());
		
		// Using methods from abstract method Crashable
		car.setCarStrength(10);
		System.out.println("Car Strength: "+car.getCarStrength());
		
	}
	
}