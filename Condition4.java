import java.util.Scanner;

public class Condition4 {

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
	
	if(tMarks>pMarks)//400>0 true  -76>0 false -1>0 false 
	{
		 if(tMarks>dMarks)
			 System.out.println("tenth marks greater than puc and degree marks");
	}else if(pMarks>dMarks)
		System.out.println("puc marks greater");
	else
		System.out.println("degree marks greater");
	
	System.out.println("End of program");
	}		
}	