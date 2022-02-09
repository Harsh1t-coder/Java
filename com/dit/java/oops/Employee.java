package com.dit.java.oops;

public class Employee {
 private int id;
 private double bsa;
 private String name;
 private String company;
 
 Employee(){
	 company = "Adobe";
 }
 Employee(int id,String name,double bsa){
	 this();
	 this.id=id;
	 this.name = name;
	 this.bsa = bsa;
 }
 
 public void print() {
	 System.out.println("Id:"+ id);
	 System.out.println("Name:" +name);
	 System.out.println("BSA: "+bsa);
	 System.out.println("Company: "+company);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ram = new Employee(1,"Ram",412.0);
		ram.print();
	}

}
