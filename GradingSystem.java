import java.util.Scanner;

public class GradingSystem {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of Math's: ");
		float math = sc.nextFloat();
		System.out.println("Enter the Marks of Science: ");
		float science = sc.nextFloat();
		System.out.println("Enter the Marks of English");
		float eng = sc.nextFloat();
		
		float totalMarks = math + science + eng;
		float percentage = (totalMarks / 300)*100;
		System.out.println("Marks Obtained: "+totalMarks+" out of 300");
		System.out.println("Percentaage Obtained:" + percentage+"%");
		
		if(percentage < 90 && percentage > 70)
			System.out.println("A Grade");
		else if(percentage < 70 && percentage > 60)
			System.out.println("B Grade");
		else if(percentage < 60 && percentage > 50)
			System.out.println("C GRADE");
		else
			System.out.println("D GRADE");
	
	sc.close();
	}
}
