import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int ele1=in.nextInt();
      int ele2=in.nextInt();
      int f1=-1,f2=-1;
      for(int i=0;i<n;i++)
      {
        if(ele1==a[i])
        {
          f1=i;
        }
        if(ele2==a[i])
        {
          f2=i;
        }
      }
      System.out.println(f1);
      System.out.println(f2);
    }
}