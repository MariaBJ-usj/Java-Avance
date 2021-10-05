package fr.dauphine.javaavance.td1;

public class TestPoint {
	
//	public void Cartesan() {
//		Point p=new Point();
//		System.out.print(p.getX()+" "+p.getY());
//	}
	
	public static void main(String[] args) {
	
	}
	
	
	//2.2/ an error was given on p.x and p.y because x and y are variables that are private to the class Point and 
	//aren't visible to the class TestPoint
	//in order for this class to work we need to create getters and setters for the variables x and y so that the class
	//TestPoint is able to access them
	
	//2.3/ all fields visibility need to be set to private to achieve the principle of encapsulation where the values of
	//variables or other data objects are hidden an can only be accessed by authorized parties via getters and setters 
	//for viewing or modification. This prevents direct access to those values and their modification by unwanted parties. 
	
	//2.4/ an accessor is a method that returns the value of a private variable of a class. The use of an accessor is crucial
	//in this exercise to solve 2.2, as we need it to access the value of variables x and y in the class Point. Otherwise these
	//variables remain hidden from the class TestPoint.
	

	
}
