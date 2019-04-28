import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int k=in.nextInt();
      int temp=0;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(a[j]<a[i])
          {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          } 
        } 
      }
   

        System.out.println(a[k-1]);
     
    }   
}