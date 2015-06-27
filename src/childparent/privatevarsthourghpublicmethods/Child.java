package childparent.privatevarsthourghpublicmethods;

public class Child extends Parent {

	
	public void methodGettingPrivateVariable() {
		
		super.setName("dfg");
		setName("Rohan");
		String a = getName();
		System.out.println(a);
	}

	public static void main(String[] args) {
		Parent parent = new Child();
		((Child)parent).methodGettingPrivateVariable();
		
	}
}
