package fr.dauphine.javaavance.td1;

import java.util.LinkedList;

public class Polyline {

	//private Point[] points;
	
	//4.6/
	private LinkedList<Point> points;
	
	//private int index;

	public Polyline(int max) {
		//points = new Point[max];
		
		//4.6/
		points = new LinkedList<Point>();
		
		//index=0;
	}

	public void add(Point p) {
//		if(index<points.length) {
//			points[index]=p;
//			index++;
//		}
	}
	
	//4.2/adding more points than the maximum capacity will result in an error as the array is full. to prevent this we need to check
	// if the array is full, if it is then the Point is not added, if it isnt full then we add the Point. to do that we use an index variable
	//that lets us know what the index of the last element in the array is. if it is higher than or equal to the length of the array, 
	//then the array is full and adding and element should be prevented.
	

	//public int pointCapacity() {
		//return points.length;

		//4.6/there is no need to have a specific capacity
	//}

	public int nbPoints() {
//		int nb=0;
//		for (int i = 0; i < points.length; i++) {
//			if(points[i]!=null) {
//				nb++;
//			}
//		}
//		return nb;
		
		//4.6/
		return points.size();
	}
	
	public boolean contains(Point p) {
		
//		for (Point point : points) {
//			if (point.equals(p)) {
//				return true;
//			}
//		}
//		return false;
		
		//4.6/
		return points.contains(p);
	}
	
	
	//4.5/the addition of a null point wont matter but it is highly discouraged because it would mean the polyline is missing a point. 
	//to prevent adding null objects we use 'Objects.requireNonNull(o)' in order to check if an object is null or not,
	//and if the object is returned than it will be added to the array.
	

}
