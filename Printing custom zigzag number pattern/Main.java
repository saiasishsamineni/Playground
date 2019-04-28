import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt(),num=1,count;
      for(int i=1;i<=n;i++)
      {
        num=i;
        count=num;
       if(i%2==0)
         System.out.print(count+1);
        for(int j=1;j<n;j++)
        {
         System.out.print(num);
        }   
       if(i%2==1)
        System.out.print(num+1);
       
        System.out.println();
        num++;
      }
	}
}