import java.util.Scanner;

public class ReversePattern {
	public static void func1(int i,int r){
		 for (int j = i; j <= r; j++)
        {
    	    System.out.print(" ");
           
        }  
      for (int j = 2; j <= i; j++)
      {

  	  System.out.print("* ");
      }
  
      System.out.println();
	}
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter r ");
       int r = sc.nextInt();
       
       // ulta
       System.out.println();
       System.out.println();
       for (int i = r-2; i >= 0; i-=2)
       {
       	 func1(i,r);
       }   
       
       sc.close();
   }
   
   
}
