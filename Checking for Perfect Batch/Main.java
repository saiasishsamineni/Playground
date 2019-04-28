import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    int n1=n/3;
    int b[]=new int[n1];
    int j=0;
    for(int i=0;i<n1;i++)
    {
      for(int count=0;count<3 && j<n;count++ )
      {
        b[i]=b[i]+a[j];
        j++;
      }
    }
    int s=b[0];
int flag=0;
    for(int i=0;i<n1;i++)
    {
      if(s==b[i])
      {
        flag=1;
      }
     else
     {
       flag=0;
     }
    }
    if(flag==0)
    {
      System.out.println("Not a Perfect Batch");
    }
    else
    {
      System.out.println("Perfect Batch");
    }
  }
}