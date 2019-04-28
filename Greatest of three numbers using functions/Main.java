import java.util.Scanner;
class Main{
    public static int gcd(int n1,int n2,int n3)
  {
      int big=n1;;
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
      return big;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int ans=gcd(n1,n2,n3);
      System.out.println(ans);
      }

}
  
