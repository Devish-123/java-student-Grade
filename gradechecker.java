import java.util.*;
public class student
{
    
    public static void student_grade()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students....");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            System.out.println("enter the name of the student...");
            sc.nextLine();
            String student = sc.nextLine();
            System.out.println("enter the marks...");
            int marks = sc.nextInt();
            if(marks >= 80)
            {
                System.out.println(" A grade");
               

            }
            else if(marks >= 65)
            {
                System.out.println(" B grade");
            }
            else
            {
                System.out.println("C Grade....");
            }


        }
    }
    public static void main(String args[])
    {
        
         student_grade();
    }
}
