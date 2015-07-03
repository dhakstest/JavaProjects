package com.generic.test;

/**
 * This is generic class which accepts of type T
 * This the request class which wrappes the object that needs to be handled
 * @author dgunasek
 *
 * @param <T>
 */
public class Request<T> {

	private T t;
	private String type;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
