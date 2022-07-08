package com.ny.java.practice;

public class Calling_Method {

	
	
public static void main(String[] args) {
	
	Calling_Method.Test1();//Here calling the static method by classname.methodname.
	Calling_Method obj = new Calling_Method();
    obj.Test2();
// Here we are calling the non static method by creating object.
//We have to create an object as follows:
//classname obj = new classname();
//obj.methodname();
    
    Calling_Method.Test3();//Here calling the static method by classname.methodname.

}	
	public static void Test1() {
	
	System.out.println("Math");
	}
	
	public void Test2() {
    
	System.out.println("English");
}
    public static void Test3() {

     System.out.println("Scince");
}
	
	
	
	
	
	
	
	
	
	

}
