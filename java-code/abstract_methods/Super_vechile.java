  //package abstract_methods;
 
public class Super_vechile extends Crashable implements Drivable, Cloneable{
//super class of the class is Crashable		
	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrength = 0;
	
	public int getWheels(){
		return this.numOfWheels;
	}
	
	public void setWheels(int numWheels){
		this.numOfWheels = numWheels;
	}
	
	public double getSpeed(){
		return this.theSpeed;
	}
	
	public void setSpeed(double speed){
		this.theSpeed = speed;
	}
	
	public Super_vechile(){
		
	}
	
	public Super_vechile(int wheels, double speed){
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}
	
	public void setCarStrength(int carStrength){
		this.carStrength = carStrength;
	}
	
	public int getCarStrength(){
		return this.carStrength;
	}
	
	public String toString(){
		return "Num of Wheels: " + this.numOfWheels;
	}
	
	public Object clone(){
		Super_vechile car;
		
		try{
			car = (Super_vechile) super.clone();
		}
		
		catch(CloneNotSupportedException e){
			return null;
		}
		return car;
	}
	
}