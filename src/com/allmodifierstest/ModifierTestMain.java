package com.allmodifierstest;

import java.util.ArrayList;

import com.allmodifierstest.outsidepackage.OutsideChildClass;

public class ModifierTestMain {

	public int testVariable; // / CHANGE THIS PUBLIC TO EACH MODIFIER AND SEE

	
	public static int value ;

	public void method1() {

		testVariable = 1; // can access this way because it is a property of it

	}

	static public void main(String[] args) {
		int a = 50;
		Integer a2 = new Integer(a);// Boxing

		Integer a3 = a;// Boxing

		System.out.println(a2 + " " + a3);

		Integer i = new Integer(50);
		Integer p = i;

		ModifierTestMain.method1((long) a);
		method11();
	}

	public static void method1(Long a) {
		System.out.println(a);
		System.out.println("D   \" dfgdfg/   \"   emo ");
	}

	public static void method11() {
		ModifierTestMain.value = 3;
		System.out.println(ModifierTestMain.value);
		new OutsideChildClass().value = 45;
		System.out.println(ModifierTestMain.value);
		new OutsideChildClass(3).value = 344;
		System.out.println(ModifierTestMain.value);
	}
	
}


abstract class A{
	public void aaa() {
		System.out.println("sdfsd");
	}
	public abstract void bbb();
}
class AAA extends A{

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();

	} 
	
}


