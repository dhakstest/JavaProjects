package com.generic.test;


public class PairSwapTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SPair<Integer> swp = new SPair<Integer>(17, 56);
		System.out.println("Before Swaping");
		System.out.println(swp.getFirst());
		System.out.println(swp.getSecond());
		swp.swap();
		System.out.println("After Swaping");
		System.out.println(swp.getFirst());
		System.out.println(swp.getSecond());
		
	}
	

}

class SPair<T> {
	private T first;
	private T second;

	public SPair() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructs a pair containing two given elements.
	 * 
	 * @param firstElement
	 *            the first element
	 * @param secondElement
	 *            the second element
	 */
	/*
	 * public SPair(T ele[]) {
	 * 
	 * first = ele[0]; second = ele[1]; }
	 */

	public SPair(T i, T j) {
		// TODO Auto-generated constructor stub
		first = i;
		second = j;
	}

	/**
	 * Gets the first element of this pair.
	 * 
	 * @return the first element
	 */
	public T getFirst() {
		return first;
	}

	/**
	 * Gets the second element of this pair.
	 * 
	 * @return the second element
	 */
	public T getSecond() {
		return second;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(T second) {
		this.second = second;
	}
	public void  swap(){
		T k;
		k = first;
		first = second;
		second = k;
		
	}

}
