package com.collections.hashtable;


/**
 * Problem Statement:    Write a program to remove duplicate key from hashtable.
 * 
 * @author bthombre
 *
 */
public class Students {

	
	/*
	 * initialisation of variables along with getter and setter.
	 */
	
	private String name;
	private int reg_No;
	private int roll;

	public Students(int roll, String n, int s)
	{
		this.roll = roll;
		this.name = n;
		this.reg_No = s;
	}     
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getreg_No()
	{
		return reg_No;
	}
	public void setreg_No(int reg_No)
	{
		this.reg_No = reg_No;
	}
	public String toString()
	{
		return "roll: "+this.roll+", Name: "+this.name+", Registration_No: "+this.reg_No;
	}
	public void setroll(int roll)
	{
		this.roll = roll;
	}
	public int getroll()
	{
		return roll;
	}     
	
	
	@Override
	public int hashCode()
	{
		System.out.println("In hashcode method");
		return this.getroll();
	}     
	
	@Override
	public boolean equals(Object obj)
	{
		Students stud = null;
		if(obj instanceof Students)
		{
			stud = (Students) obj;
		}
		System.out.println("In equals methods");
		if(this.getroll() == stud.getroll())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
