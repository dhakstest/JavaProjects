/**
 * 
 */
package com.ArrayListTest;

import java.util.List;

/**
 * @author dgunasek
 *
 */
public interface StudentArrayListDB {

	public Student addStudent(Student student);
	public Student updateStduent(Student student);
	public void displayAllStudent(Student student);
	public boolean deleteStudent(Student student);
	
	public Student searchStudent(String searchByKey, String searchByValue);
	
	public List<Student> sortStudent(String sortBy);
	
	public void validateStudent(Student student);
}
