package com.allmodifierstest;

public class ChildInsidePackage extends ModifierTestMain{
	
	public void method1() {
		testVariable =1;  // can access this way because it is inherited
	}
	
}