package test;

import java.security.KeyStore.Entry;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class StaticExample{
	
    static {
        System.out.println("This is first static block");
    }

    public StaticExample(){
        System.out.println("This is constructor");
    }

    public static String staticString = "Static Variable";

    static {
        System.out.println("This is second static block and "
		                                        + staticString);
    }

    {
    	//init
    }
    final static public   synchronized   String  aaaa(){
    	return "";
    }
    public static void main(String[] args){
        StaticExample statEx;
        StaticExample statE1;// = new StaticExample();
        //StaticExample.staticMethod2();
        
        ///different example start
        Map<TestClass	,	String > hashtabl = new Hashtable<>();
        
        TestClass class1 = new TestClass();
        class1.setName("Rohan");
        
        TestClass class2 = new TestClass();
        class2.setName("Rohan");
        
        
        hashtabl.put(class1, "A");
        hashtabl.put(class2, "B");
       
        Iterator<TestClass> countryCapitalIter=hashtabl.keySet().iterator();
        while (countryCapitalIter.hasNext()) {
			System.out.println(countryCapitalIter.next());
			
		}
    }

    static {
        staticMethod();
        System.out.println("This is third static block");
    }

    public static void staticMethod() {
        System.out.println("This is static method");
    }

    public static void staticMethod2() {
        System.out.println("This is static method2");
    }
}
