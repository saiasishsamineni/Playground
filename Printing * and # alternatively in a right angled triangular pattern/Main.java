import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      //Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      char ch='*';
      for(int i=1;i<=row;i++)
      {
        
         for(int j=1;j<=i;j++)
         {
         System.out.print(ch);
             if(ch=='*')
        {
          ch='#';
        }
       else
       {
         ch='*';
       }
         }
      
         System.out.println();
      }
    }
}