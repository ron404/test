package com.allmodifierstest.outsidepackage;

import com.allmodifierstest.ModifierTestMain;


public class OutsidePackageTest {

	public void method1() {
		ModifierTestMain modifierTest = new ModifierTestMain();
		modifierTest.testVariable =1 ;
	}
	public OutsidePackageTest() {
		
	}
}
