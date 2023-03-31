import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
	//local variable---variable which are declared inside the method or inside the if,switch,loops	
	int num=0;
	
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Enter the number");
	num=scanner.nextInt();
	//400, -76,-1,0,765
	if(num>0)//400>0 true  -76>0 false -1>0 false 
	{
		System.out.println("positive number");//1 5
	}else if(num==0)//-76==0 false  -1==0  false
	{
		System.out.println("Nutral number"); //4 
	}else
	{
		System.out.println("Negative number");//2 3
	}
	
	scanner.close();
	
	
	
	
	
	
	
	
	}

}