import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
	//local variable---variable which are declared inside the method or inside the if,switch,loops	
	int num=0;
	
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Enter the number");
	num=scanner.nextInt();
	
	if(num>100)//true
	{
		System.out.println("yes number is greater than 100");
	}else 
	{
		System.out.println("No, number is not greater than 100");
	}
	
	}
}	