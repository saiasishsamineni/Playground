import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
          Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int o[]=new int[k+1];
      for(int i=1;i<=k;i++)
      {
        o[i]=0;
      }
     for(int i=1;i<=k;i++)
     {
       for(int j=0;j<n;j++)
       {
         if(i==a[j])
         {
           o[i]=o[i]+1;
         }
       }
     }
     for(int i=1;i<=k;i++)
      {
        System.out.println(i+" "+o[i]);
      }
    }
}