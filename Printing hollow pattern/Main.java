import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
       for(int i=0;i<n;i++)
       {
         System.out.print("*");
       }
       System.out.println();
      for(int i=2;i<n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(j==1||j==n)
          {
            System.out.print("*");
          }
          else
          {
           System.out.print(" "); 
          }
        }   
        System.out.println();
      }
        for(int i=0;i<n;i++)
       {
         System.out.print("*");
       }
       System.out.println();
	}
}