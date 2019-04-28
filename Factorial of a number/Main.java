import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
            Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=1,s=1;
      while(i<=n)
      {
          s=s*i;
        
          
        
        i++;
      }
      System.out.println(s);
	}
}