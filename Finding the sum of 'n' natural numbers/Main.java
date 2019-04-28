import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f=0;
    for(int i=1;i<=n;i++)
    {
      f=f+i;
    }
    System.out.println(f);
  }
}