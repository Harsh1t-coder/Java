package com.dit.java.oops;


public class Employee2 {

	private int id;
	private String name;
	private double bs;
	private String companyName;
	private double hra;
	private double da;
	private double ta;
	private double pf;
	private double ma;
	private double grossSal;
	private double ns;
	
	Employee2(){
		companyName = "Dit";
	}
	
	Employee2(int id,String name,double BS){
		this();
		this.id = id;
		this.name = name;
		this.bs = BS;
		compute();
		print();
	}
	
	private void compute() {
			hra = (0.3*bs);
			da = (0.2*bs);
			ta = (0.1*bs);
			ma = (0.15*bs);
			pf = (0.05*bs);
			grossSal = bs+hra+da+ta+ma;
			ns = grossSal - pf;
	}
	
	private void print() {
		System.out.println("************************");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Basic Salary: "+bs);
		System.out.println("Company Name: "+companyName);
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("TA:"+ta);
		System.out.println("MA: "+ma);
		System.out.println("PF: "+pf);
		System.out.println("GROSS SALARY: "+grossSal);
		System.out.println("NET SALARY: "+ns);
		System.out.println("************************");
	}
	
	public static void main(String[] args) {
		Employee2 Ram = new Employee2(1,"Ram",800000);
		Employee2 Shyam = new Employee2(2,"Shyam",700000);
	}

}
