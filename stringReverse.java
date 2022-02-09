
public class stringReverse {
	public static void main(String args[]) {
		String s1 = "Ram";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			//System.out.print(i);
			System.out.print(s1.charAt(i));
			s2=s2+s1.charAt(i);
		}
	//	System.out.print(s2);
	}
}
