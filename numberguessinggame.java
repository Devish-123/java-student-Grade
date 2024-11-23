import java.util.Random;
import java.util.Scanner;
public class demo 
{

public static void main(String args[])
{
   Scanner sc = new Scanner(System.in);
   Random rand = new Random();
   int random = rand.nextInt(100);
   int attempt = 0;
   int max = 5;
   boolean number = false;
   System.out.println("welcome to the game");
   while(attempt < max)
   {
    System.out.println("enter the number");
      int n = sc.nextInt();
      if(n == random)
      {
        System.out.println("congratulations you won....");
        number = true;
        break;
      }
      else if(n > random)
      {
             System.out.println("enterd number is greater....");
      }
      else
      {
        System.out.println("enterd number is lower....");
      }
      attempt++;
     

   }
   if( number == false)
   {
    System.out.println("number enterd wrond,,better luck next time");
   }
   sc.close();

}
}
