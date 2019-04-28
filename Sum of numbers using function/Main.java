import java.util.Scanner;
class Main{
   public static int sum(int n)
     { 
     int sm=0;
       for(int i=1;i<=n;i++)
       {
         sm=sm+i;
       }
     
     return sm;
     }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sm=sum(n);
      System.out.println(sm);
	}
}