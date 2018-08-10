//package abstract_methods;
public class LessonSixteen{
	
 public static void main(String[] args){
		
 // Every object that is created inherits all the methods in the Object class
		
 Object superCar = new Super_vechile();
// superCar inherits all of the Object methods, 
//	but an object of class Object can't access the 
// Super_vechile methods.
// System.out.println(superCar.getSpeed()); * Throws an
//error

// You can cast from type Object to Vehicle to access
// those methods
 System.out.println(((Super_vechile)superCar).getSpeed());
 // The methods of the Object class
 Super_vechile superTruck = new Super_vechile();
		
// equals tells you if two objects are equal
 System.out.println("Are  two objects [superCar] [superTruck] equal => "+
				superCar.equals(superTruck));
// The above command will return  false becuse the are two 
//spreate objects
		

// hashCode returns a unique identifier for an object
 System.out.println("id=  "+ superCar.hashCode());
		
// finalize is called by the java garbage collector 
// when an object is no longer of use. 
// If you call it there is no guarantee it will
// do anything though
		
// getClass returns the class of the object
		
System.out.println("Class of the object= "+superCar.getClass());
		
 // THE CLASS OBJECT
 // You can use the Class object method getName to 
//get just the class name
		
System.out.println("Class name = "+superCar.getClass().getName());
		
// You can check if 2 objects are of the same class with getClass()
		
if(superCar.getClass() == superTruck.getClass()){
	System.out.println("They are in the same class");
	}
		
// getSuperclass returns the super class of the class 
		
System.out.println("Super class of the class = "+superCar.getClass().getSuperclass());
		
// the toString method is often overwritten for an object
		
System.out.println("superCar.toString()  ==>  "+superCar.toString());
// In the "Super_vechile.java" file the function "toString" is defind as:
//  public String toString(){	return "Num of Wheels: " + this.numOfWheels;  }
// so the output will be "100"




		
// toString is often used to convert primitives to strings
		
		int randNum = 100;
		System.out.println(Integer.toString(randNum));
		
// THE CLONE METHOD
// clone copies the current values of the object and assigns
// them to another. If changes are made after the clone both
// objects aren't effected though
// to use colne you sould add  implements Drivable, Cloneable to 
// Super_vechile class defination 	and to add public Object clone() to the
//	Super_vechile class
superTruck.setWheels(6);
		
Super_vechile superTruck2 = (Super_vechile)superTruck.clone();
		
System.out.println("superTruck.getWheels() ==> "+superTruck.getWheels());
		
System.out.println("superTruck2.getWheels() ==> "+superTruck2.getWheels());
		
		// They are separate objects and don't have equal hashcodes
System.out.println("superTruck.hashCode() ==> "+superTruck.hashCode());
System.out.println("superTruck2.hashCode() ==> "+superTruck2.hashCode());
		
		// There are subobjects defined in an object clone won't
		// also clone them. You'd have to do that manually, but this
		// topic will be covered in the future because of complexity
		
	}
	
}

/* 
Objects: Objects represent an entity and the basic building block.

Class: Class is the blue print of an object.

Abstraction: Abstraction represents the behavior of an real world entity.

Encapsulation: Encapsulation is the mechanism of binding the data together and hiding them from outside world.

Inheritance: Inheritance is the mechanism of making new classes from existing one.

Polymorphism: It defines the mechanism to exists in different forms
 */