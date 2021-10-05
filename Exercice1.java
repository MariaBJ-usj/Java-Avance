package fr.dauphine.javaavance.td1;

public class Exercice1 {
	public static void main(String[] args) {
		System.out.println();
		//1.2/when i pressed ctrl + space on 'sysout' in the main method in auto completes itself to System.out.println();	
	}
	//1.4/pressing ctrl + space on main in the class gives suggestions on how to complete it, the first suggestion being 
	//the method main() which gets auto completed if we choose this suggestion
	
	@Override
	public String toString() {
		return super.toString();
	}
	//1.3/pressing ctrl + space on 'tostr' in the class gives suggestions on how to complete it, the first suggestion being 
	//the method toString() which gets auto completed if we choose this suggestion
	
	private int foo;
	
	public Exercice1() {
		
	}
	//1.5/pressing ctrl + space inside the class gives suggestions, the first one suggesting to auto implement the constructor
	//Exercice1();
	
	public void setFoo(int foo) {
		this.foo = foo;
	}
	//1.5/pressing ctrl + space on 'set' in the class gives suggestions on how to complete it, the first suggestion being 
	//the method setFoo() which gets auto completed if we choose this suggestion
	
	//1.6/pressing alt+shift+r on the class name and the int field shows al the places where their name appears in the class
	//and gives us the option to refactor the name
	
	private String myStr; 
	//1.7/hovering over the string's name with the control key pressed gives us the option of opening its declaration
	//or opening its implementation
}
