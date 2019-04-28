import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
                  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=1,s=1,f=0,r,q=n;
      while(q>0)
      {
        r=q%10;
        q=q/10;
        s=1;i=1;
      while(i<=r)
      {
          s=s*i;
          i++;
      }
      f=f+s;
      }
     if(f==n)
      System.out.println("Yes");
      else
        System.out.println("No");
	
	}
}