package fr.dauphine.javaavance.td1;

public class Circle {
	private Point center;
	private double radius;

	public Circle(Point p, int r) {
		center=new Point(p.getX(), p.getY());
		radius=r;
	}


	//5.7/the code below is the answer
	public double area() {
		return (Math.PI*(Math.pow(radius, 2)));
	}

	@Override
	public String toString() {
		return "Circle center: "+this.center+", Circle radius: "+this.radius+", Circle area: "+this.area();
	}

	public void translate(int dx, int dy) {
		center.translate(dx, dy);
	}


	//5.8/the code below is the answer
	public boolean contains(Point p) {
		double distance = Math.pow(p.getX(), 2)+Math.pow(p.getY(), 2);
		double rSquare=Math.pow(this.radius, 2);
		if (distance<=rSquare) {
			return true;
		}
		return false;	
	}

	//5.9/the code below is the answer
	public boolean contains(Point p, Circle[] circles) {
		for (Circle circle : circles) {
			double distance = Math.pow(p.getX(), 2)+Math.pow(p.getY(), 2);
			double rSquare=Math.pow(circle.radius, 2);
			if (distance<=rSquare) {
				return true;
			}
		}
		return false;	
	}


	public static void main(String[] args) {
		Circle c=new Circle(new Point(1,1), 10);
		Point p = new Point(5,9);
		System.out.println(c.contains(p));
	}

	@Override
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		return this.center==c.center && this.radius==c.radius;
	}

	//5.5/The problem with this code is that the translation will apply to the centers of both c and c2 because they have the same 
	//point as center. to prevent that we can just make center a new point and give it the same coordinates as p.

	//5.6/getCenter() is dangerous because it allows us to translate it in other words to modify the center's coordinates,
	//which shouldn't be allowed at least in a get method. To fix this we should return a point with the same coordinates 
	//as center.
}
