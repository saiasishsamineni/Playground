import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int j=n-1,flag=0;
      for(int i=0;i<n/2;i++)
        {
          if(arr[i]==arr[j]&&j>n/2-1)
          {
            j--;
          }
       else
       {
         flag=1;
          break;
       }
        }
      if(flag==1)
      {
        System.out.println("No");
      }
     else
     {
       System.out.println("Yes");
     }
    }
}