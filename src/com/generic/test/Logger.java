package com.generic.test;

import java.util.Date;

/**
 * Logger class provided convient method for logging 
 * @author dgunasek
 *
 */
public class Logger {
	
	public static void println(Class<?> cls, String logString)	{
		System.out.println(new Date() + " : " + cls.getName() + " : " + logString);
	}

}
