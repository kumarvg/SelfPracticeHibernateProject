package com.Hibernate.PracticeGround;



public class Student {

	
	private int rollno;
    private String name;
	private String branch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", branch=" + branch + "]";
	}
	
	
}
