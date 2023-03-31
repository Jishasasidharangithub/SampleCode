import java.util.Scanner;

public class Condition1 {

	//10th puc degree >=70
	public static void main(String[] args) {
	//local variable---variable which are declared inside the method or inside the if,switch,loops	
	int tMarks=0,pMarks=0,dMarks=0;
	
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Enter the number tenth marks");
	tMarks=scanner.nextInt();
	System.out.println("Enter the number puc marks");
	pMarks=scanner.nextInt();
	System.out.println("Enter the number degree marks");
	dMarks=scanner.nextInt();
	//400, -76,-1,0,765
	if(tMarks>=70)//400>0 true  -76>0 false -1>0 false 
	{
		if(pMarks>=70)
		{
			if(dMarks>=70)
			{
				System.out.println("Eligible for the interview");
			}else
				System.out.println("Not Eligible for the interview--due to degree marks");
			
		}else
			System.out.println("Not Eligible for the interview--due to puc marks");
		
	}else
		System.out.println("Not Eligible for the interview--due to tenth marks");
	
	scanner.close();
	
	
	
	
	
	
	
	
	}

}