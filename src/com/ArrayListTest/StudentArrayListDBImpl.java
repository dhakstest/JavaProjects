/**
 * 
 */
package com.ArrayListTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dgunasek
 *
 */
public class StudentArrayListDBImpl implements StudentArrayListDB {

	private StudentArrayListDBImpl studentArrayListDBImpl;
	private List<Student> studentArrayListDB = new ArrayList<Student>();
	private List<Student> tempStudenList = new ArrayList<Student>();

	private StudentArrayListDBImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public  StudentArrayListDBImpl getStudentArrayListDBImpl()	{
		if( this.studentArrayListDBImpl == null)	{
			this.studentArrayListDBImpl = new StudentArrayListDBImpl();
		}
		return this.studentArrayListDBImpl;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStduent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayAllStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student searchStudent(String searchByKey, String searchByValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> sortStudent(String sortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validateStudent(Student student) {
		
		if(!checkStudentId(student.getStudentId()))	{
			throw new IllegalArgumentException("Student ID already exists. Please Enter a new ID and try again !");
		}
		if(student.getFirstName() == null)	{
			throw new IllegalArgumentException("Student FirstName cannot be null !");
		}
		if(student.getLastName() == null)	{
			throw new IllegalArgumentException("Student LastName cannot be null !");
		}
		if(student.getAge() <= 18)	{
			throw new IllegalArgumentException("Student age should be over 18!");
		}
	}

	/**
	 * This method check if the student id already exists.
	 * @param studentId
	 * @return if the student id already exists then returns false, else true
	 */
	private boolean checkStudentId(int studentId) {
		if(this.studentArrayListDB.isEmpty())	{
			return true;
		}
		for (Student student : this.studentArrayListDB) {
			if(studentId == student.getStudentId())	{
				return false;
			}
		}
		return true;
	}

	public List<Student> getStudentArrayListDB() {
		return studentArrayListDB;
	}

	public List<Student> getTempStudenList() {
		return tempStudenList;
	}

}
