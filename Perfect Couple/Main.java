import java.util.*;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int s=in.nextInt();
      for(int i=0;i<=n/2;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(a[i]+a[j]==s)
          {
            System.out.println(a[i]+", "+a[j]);
          }
        }
      }
    }
}
 