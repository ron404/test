package childparent;

public class Child extends Parent {

	final String a;
	
	
	public Child() {
		super("Hello");
		//this("hELO"); /// can;t call two constructors in a constructor
		a=""; // can't init in a method because a method can be invoked many time but a constructor can't (unless you use the reflection API)
		
	}
	public Child(String aaaa) {
		super("Hello");
		a=""; // can't init in a method because a method
		
	}
	/*public static void methodname1() {
		System.out.println("methodname1 in child");
	}*/
	
	//This static method cannot hide the instance method from Parent
	public /*static*/ void methodname2() {
		System.out.println("methodname2 in child");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void overloadmethod(Object object) {
		System.out.println("Object object");
	}
	public void overloadmethod(String object) {
		System.out.println("String object");
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.overloadmethod("Helloooo");
		
		
		Parent parent= new Child();
		parent.methodname2();
		parent.methodname1();
		
		System.out.println();
		new Child().methodname1();
		
		//parent.methodname1();
		//((Child)parent).methodname1();
	}
	

}
