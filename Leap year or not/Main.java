import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        int y=in.nextInt();
		// Type your code here
      if(y%10==0||y%100==0)
      {
        if(y%400==0)
        {
           System.out.println("Leap year");
        }
        else
        {
           System.out.println("Non Leap year");
        }
      }
    else
    {
      System.out.println("Non Leap Year");
    }
      
    }
}