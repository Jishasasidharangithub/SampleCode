import java.util.Scanner;

public class FindMaxMin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;  
        char ch;
	
        do
        {
            System.out.print("Enter the number ");
            num = sc.nextInt();
        
            if(num > max)
            {
                max = num;
            }
            
            if(num < min)
            {
                min = num;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(ch=='y' || ch == 'Y');
        
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }  
}
		
		