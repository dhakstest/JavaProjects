package com.generic.test;

public class Employee {

	
	private long empid;
	private String ename;
	private String dname;
	private double salary;
	public Employee(int empid, String ename, String dname, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.dname = dname;
		this.salary = salary;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [Employee_id=");
		builder.append(empid);
		builder.append(", Employee_name=");
		builder.append(ename);
		builder.append(", Dept_name");
		builder.append(dname);
		builder.append(", Salary=");
		builder.append(salary);	
		return builder.toString();
	}
}
