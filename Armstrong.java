
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 370;
		int j = i;
		int num=0;
		while(j!=0) {
			int tmp = j%10;
			num+=tmp*tmp*tmp;
			j/=10;
		}
		if(num==i)
			System.out.print("YES");
		else
			System.out.print("NO");
	}

}
