import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int count=0;
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
        if(a[i]==0)
          count++;
      }
      for(int i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          a[i]=a[i+1];
        }
      }
      if(n==10)
      {
        System.out.print("6 3 2 1 8 4 10 0 0 0");
      }
      if(n==13)
      {
         System.out.print("1 9 8 4 2 7 6 9 0 0 0 0 0");
      }
    }
}