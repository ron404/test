package com.allmodifierstest.outsidepackage;

import com.allmodifierstest.ModifierTestMain;

public class OutsideChildClass  extends ModifierTestMain{
	
	public static int a ; 
	public void method1() {
		
		testVariable =1;  // can access this way because it is inherited

	}
	public OutsideChildClass(int a) {
		// TODO Auto-generated constructor stub
	}
	public OutsideChildClass() {
		// TODO Auto-generated constructor stub
	}
	
}

