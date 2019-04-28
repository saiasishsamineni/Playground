import java.util.Scanner;
 public class Main
{
  public static void main(String[] args)
  {
     Scanner in=new Scanner(System.in);
     int base=in.nextInt();
     int exp=in.nextInt();
    int ans=1;
    for(int i=1;i<=exp;i++)
    {
      ans=ans*base;
    }
    System.out.println(ans);
  }
  
}