import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt(),c=1;
      for(int i=1;i<=n;i++)
      {
        for(int k=0;k<n-i;k++)
        {
           System.out.print(" ");
        }
        for(int j=1;j<=c;j++)
        {
          System.out.print("*");
          
        }
        System.out.println();
        c=c+2;
      }
	}
}