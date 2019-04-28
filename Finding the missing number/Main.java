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
      int c=n,flag=0;
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
         if(arr[j]!=c && c>0)
         {
           flag=1;
         }
        else
         {
          flag=0;
          break;
         }
        }
       if(flag==1)
       {
         System.out.println(c);
         
       }
       c--;
     }
   }   
}