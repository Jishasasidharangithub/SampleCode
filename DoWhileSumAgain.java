import java.util.Scanner;

public class DoWhileSumAgain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     
        int num1, num2;
        char ch;
        
        do
        {
            System.out.print("Enter the first number ");
            num1 = sc.nextInt();
          
            System.out.print("Enter the second number ");
            num2 = sc.nextInt();
            
            int sum = num1 + num2;
            System.out.println("Sum of numbers: " + sum);
        
            System.out.print("Do you want to continue yes/no? ");
            ch = sc.next().charAt(0);
            
            System.out.println();
            
        }while(ch=='y' || ch == 'Y');
    }  
}


