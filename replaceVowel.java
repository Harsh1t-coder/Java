import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class replaceVowel {
	public static void main(String args[]) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		str = str.toLowerCase();
		char s[] = str.toCharArray();
		int i=0;
		int j = s.length-1;
		while(i<=j)
		{
			if(s[i]=='a' || s[i]=='e'|| s[i]=='i'|| s[i]=='o'|| s[i]=='u')
				s[i]='X';
			if(s[j]=='a' || s[j]=='e'|| s[j]=='i'|| s[j]=='o'|| s[j]=='u')
				s[j]='X';
			i++;
			j--;
		}
		for(char x: s)
			System.out.print(x);
	}
}
