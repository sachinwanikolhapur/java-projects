package com.kiranacademy.restapiex;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student 
{
	@Id
	int rno;
	int marks;
	
	public Student()
	{
		
	}
	
	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}

	public int getRno() {
		return rno;
	}
	
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
	
	
}
