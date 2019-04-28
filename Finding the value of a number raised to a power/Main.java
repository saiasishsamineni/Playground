import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic 
      int count=1;
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exp=in.nextInt();
      int ans=base;
      while(count<exp)
      {
        ans=ans*base;
        count++;
      }
    
      System.out.println(ans);
    }
}
