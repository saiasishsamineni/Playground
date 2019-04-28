import java.util.*;
 
 public class Main
{
   public static void main(String[] args)
   {
      int n, status = 1, num = 3, count, j;
 
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
     
      if (n >= 1)
      {
         System.out.println(2);
      }
     
      for (count = 2; count <=n;)
      {
         for (j = 2; j <= Math.sqrt(num); j++)
         {
            if (num%j == 0)
            {
               status = 0;
               break;
            }
         }
         if (status != 0)
         {
            if(num<=n)
            System.out.println(num);
            count++;
         }
         status = 1;
         num++;
      }        
   }
}