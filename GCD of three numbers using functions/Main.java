import java.util.Scanner;
public class Main{
     public static int gcd(int n1,int n2,int n3)
      {
       int big=0,s=0;
      if(n1>n2&&n1>n3)
         {
         big=n1;
         } else if(n2>n1&&n2>n3)
          {
          big=n2;
          }  else if(n3>n1&&n3>n2)
           {
         big=n3;
           }
      for(int i=2;i<=big;i++)
      {
        if(n1%i==0&&n2%i==0&&n3%i==0&&(i==n1||i==n2||i==n3))
        {
          s=i;
          break;
        }
      }
       return s;
   }
      
	public static void main (String[] args)
	{
	    // Type your code here
     
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int ans=gcd(n1,n2,n3);
      System.out.println(ans);
      
	}
}