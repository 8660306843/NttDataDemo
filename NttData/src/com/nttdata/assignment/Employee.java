package com.nttdata.assignment;

public class Employee
{
	private int id;
	private String name;
	private double sal;
	private String addr;
	public Employee(int id, String name, double sal, String addr)
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", addr=" + addr + "]";
	}
	
	
	
	

}
