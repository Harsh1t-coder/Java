import java.util.Scanner;


public class primeNumber {
	  public static int func1(int n) {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0)
					return 0;
			}
			return 1;
		}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = func1(n);
		if(z==1)
		System.out.print("Prime no.");
		else 
		System.out.print("Not a Prime no.");	
		sc.close();
	}
}
