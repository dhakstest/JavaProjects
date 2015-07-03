package com.generic.test;

public interface RequestHandler {

	public boolean isHandler(String type);
	
	/**
	 * Generic method
	 * @param request
	 */
	public <T> void  handle(Request<T> request);
}
