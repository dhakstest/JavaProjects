package com.staticTest;

public class StaticTest {
	
	// static final or just static variable can be initialized in static block 
	private final static int i;
	private static String name;
	
	//non-static variable can not be initialized in static block
	// since it is final, it needs to be initialized
	private final int nonStaticInt = 20;
	
	static {
		i = 10;
		name = "test";
	}

	public StaticTest() {
		super();
	}
	
	

}
