import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		for(int i=1; i<r;i++) {
			for(int j=1;j<c;j++) {
				if(i==r-1 || i==1 || j==c-1 || j==1)
					System.out.print('*');
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
