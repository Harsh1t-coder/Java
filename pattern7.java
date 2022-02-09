public class pattern7
{
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
        int r = 30;
        
        for (int i = 0; i <= r; i+=2)
        {
        	 func1(i,r);
        }
        
        // ulta
        
        for (int i = r-2; i >= 0; i-=2)
        {
        	 func1(i,r);
        }   
      }
    
}