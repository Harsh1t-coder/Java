import java.util.Scanner;
public class Question2 {

	public static void main(String args[]) {
		//This is Salary Calculator
		Scanner sc= new Scanner(System.in);
		System.out.println("Salary Calculator");
		System.out.println("Enter Your Basic Salary");
		double basicSal = sc.nextDouble();
		double hra = (0.3*basicSal);
		double da = (0.2*basicSal);
		double ta = (0.1*basicSal);
		double ma = (0.15*basicSal);
		double pf = (0.05*basicSal);
		double grossSal = basicSal+hra+da+ta+ma;
		double beforeTax = grossSal;
		double tax =0;
		// Taxes Conditions
		if(grossSal > 900000) {
			tax = 0.3 * grossSal;
			grossSal-=tax;
		}
		else if(grossSal > 700000 && grossSal < 900000) {
			tax = 0.2 * grossSal;
			grossSal-=tax;
		}
		else if (grossSal > 500000 && grossSal < 700000){
			tax = 0.1 * grossSal ;
			grossSal-=tax;
		}
		// NET SALARY CALCULATION
		double netSal = grossSal-pf;
		
		
		System.out.println("Basic Salary: "+basicSal);
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("TA:"+ta);
		System.out.println("MA: "+ma);
		System.out.println("PF: "+pf);
		System.out.println("GROSS SALARY BEFORE TAX DEDUCTION: "+beforeTax);
		System.out.println("Tax Deducted: "+tax);
		System.out.println("GROSS SALARY: "+grossSal);
		System.out.println("NET SALARY: "+netSal);
		
		sc.close();
	}
}

