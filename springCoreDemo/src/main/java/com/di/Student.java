package com.di;

public class Student {
	
	private int id;
	private String fname;
	private String lname;
	private int rollno;
	
	public Student(int id, String fname, String lname, int rollno) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", rollno=" + rollno + "]";
	}
}
