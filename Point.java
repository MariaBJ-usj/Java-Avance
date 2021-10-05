package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {
	private int x, y;
	
	public void Cartesan() {
		//Point p=new Point();
		//System.out.print(p.x+" "+p.y);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(Point p2) {
		this.x=p2.getX();
		this.y=p2.getY();
	}
	
	//2.1/ it works because p is an instance of the class Point and x and y are variables of the class Point
	//so by using instance p we are able to access x and y
	
	//2.5|6/ 'this' should be used when calling objects or variables in a method or constructor in the class. Here if we do not use 'this' 
	//in the constructor and the parameters in the constructor are named x and y, there will be confusion between the parameters and the class'
	//variables because they have the same names, and so if we do any modifications on the variables, these changes will be made on the class' x and y variables and not on the 
	//constructor's parameters. If the parameters are called px and py, then there is no confusion and therefore no problem.
	
	//2.7/ to keep track of the number of Points we created we add a static variable in the constructor that gets incremented each times 
	//a new Point is created.
	
	//2.8/ the compiler knows which constructor to call depending on the number and the type of the arguments of each constructor.
	
	//2.9/the code below is the answer
	@Override
	public String toString() {
		return "("+this.x+", "+this.y+")";
	}
	
	public static void main(String[] args) {
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		//System.out.println(p1==p2);
		//System.out.println(p1==p3);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));

	}
	
	//3.1/ the code print 'true' then 'false', the reason for this is that p1 and p2 have the same reference as well as the same coordinates,
	//while p3, despite having the same coordinates as p1, does not have the same reference as p1. Double equals checks if the objects it is
	//comparing have the same reference, not if they have the same values of variables.
	
	//3.2/
	public void isSameAs(Point p) {
		System.out.println(this.x==p.getX() && this.y==p.getY());
	}
	
	//3.3/ only p1 was added to the list. since p2 and p3 were not added, the method 'equals()' will be used to compare p2 and p3 to p1 
	//and if they match it will return p1's index. but since 'equals()' only compares references and not the coordinates it will not work 
	//for p3 and will return -1. for this code to compare coordinates we have to override the method 'equals()' in a way that compares the 
	//values of x and y. once we do that the code should work as we wish it to and the comparison of p1 and p3 will return 0 which is the index
	//of p1 in the arraylist.
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return this.x==p.getX() && this.y==p.getY();
	}
	
	//5.1/ translate can be used to determine the distance between one point and another, or we 
	//could use it to change the coordinates of the point.
	public void translate(int dx, int dy) {
		this.x+=dx;
		this.y+=dy;
	}
}
