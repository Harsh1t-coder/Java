import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) throws NumberFormatException, IOException {
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//char gender = sc.next().charAt(0);
	//String name = sc.nextLine();
	int a = Integer.parseInt(br.readLine());
	String ab = br.readLine();
	//Stri xyz = br.readLine();
	String s = "night";
	String s1 = "night";
	if(s == "night")
		System.out.println("True");

	if(s == s1)
		System.out.println("True");
	else 
			System.out.println("False");

	System.out.println("YOur age is "+a);
	System.out.print(ab);
	}

}
