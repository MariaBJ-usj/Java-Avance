package fr.dauphine.javaavance.td1;

public class Ring extends Circle{

	//6.1/yes we use inheritance because Ring has the same properties as the class Circle,
	//so we should add 'extends' to the class so it inherits from the class Circle so as to not repeat those properties.

	private double innerRadius;

	//6.2/the code below is the answer
	public Ring(Point p, int r, int innerR) {
		super(p, r);
		if (innerR<r) {
			this.innerRadius=innerR;
		}else{
			System.out.println("Inner Radius should be smaller than the radius");
		}	
	}

	
	//6.3/the code below is the answer and in the equals method of the Circle class 
	@Override
	public boolean equals(Object obj) {
		Ring ring = (Ring) obj;
		return this.innerRadius==ring.innerRadius && super.equals(ring);
	}
	
	public static void main(String[] args) {
		Point p = new Point(1,2);
		Ring ring = new Ring(p, 2, 1);
		System.out.println(ring);
	}
	
	//6.4/if we want to print the ring with System.out.println(ring); the inner radius will not be printed. to solve that
	//we have to create a toString() method in the class Ring that returns the value of toString from the superclass Circle 
	//as well as the inner radius of the Ring class.

	
	//6.5/the code below is the answer
	public boolean contains(Point p) {
		return super.contains(p);
	}
	
	public boolean contains(Point p, Ring[] rings) {
		return super.contains(p, rings);
	}
}
