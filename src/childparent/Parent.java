package childparent;


public class Parent {

	private Parent() {
		System.out.println("Parent");
	}
	protected Parent(String a) {
		this();
		System.out.println("Parent");
		//this();   - can't do here .. must be first
	}
	public static void methodname1() {
		System.out.println("methodname1 in parent");
	}
	
	public void methodname2() {
		System.out.println("methodname2 in parent");
	}
	

}
