import java.util.Scanner;

public class HollowDiamond {
	
	private static void firstHalf(int r, int i) {
		for(int j = r ; j>i;j--) {
			//System.out.print(j);
			System.out.print(" ");
		}
		System.out.print("*");
		for(int j=1;j<(i-1)*2;j++)
			System.out.print(" ");
		if(i==1)
			System.out.println();
		else {
			System.out.print("*\n");
		}		
	}
	
	private static void secondHalf(int r, int i) {
		for(int j = r ; j>i;j--) 
			System.out.print(" ");
		
		System.out.print("*");
		
		for(int j=1;j<(i-1)*2;j++)
			System.out.print(" ");
		
		if(i==1)
			System.out.println();
		else 
			System.out.print("*\n");
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows");
		int r = sc.nextInt();
		for(int i=1;i<=r;i++) {  // rows line
			firstHalf(r, i);
			}
		
		for(int i=r-1;i>0;i--) {
			secondHalf(r, i);
			}
	}
}
