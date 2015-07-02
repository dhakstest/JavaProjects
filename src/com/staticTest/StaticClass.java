package com.staticTest;

import java.util.Date;

/**
 * There is no static class in java. 
 * But a class is called static class if
 * 1. All the varibles are static
 * 2. All the methods are static
 * 3. The constructor is private.
 * @author dgunasek
 *
 */
public class StaticClass {

	/**
	 * public static variable
	 */
	public static int count;
	
	/**
	 * private static variable
	 */
	private static String myName;
	
	
	private StaticClass()	{
		
	}
	
	public static void staticMethodOne()	{
		//calling a static method from another static method within the same class dose not need any variable
		println("This is static method one");
	}
	
	/**
	 * Private static method. This can be called only within this class
	 * @param str
	 */
	private static void println(String str)	{
		System.out.println(new Date() + ": "+ StaticClass.class.getName()+ ": " + str);
	}
	
	public static void println(String clsName, String str)	{
		System.out.println(new Date() + ": "+ StaticClass.class.getName()+ ": " + str);
	}
	
}
