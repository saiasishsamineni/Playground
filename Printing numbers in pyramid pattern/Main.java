import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
             Scanner in=new Scanner(System.in);
      int n=in.nextInt(),i,j,num=1;
      
      for( i=1;i<=n;i++)
      {
        for(int k=0;k<n-i;k++)
        {
           System.out.print(" ");
        }
        for( j=1;j<=i;j++)
        {
         
          System.out.print(num+" ");
           num=num+1;
        }
        System.out.println();
    
      }
    }    
}