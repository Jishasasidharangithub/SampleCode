import java.util.Scanner;
public class StudentResult{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		int roll_no=sc.nextInt();
		System.out.println("Enter the roll number:"+roll_no);

		String name=sc.next();
		System.out.println("Enter name:"+name);

		float physics=sc.nextFloat();
		System.out.println("Enter the Physics mark:"+physics);

		float chemistry=sc.nextFloat();
		System.out.println("Enter chemistry marks:"+chemistry);

		float computer=sc.nextFloat();
		System.out.println("Enter chemistry marks:"+computer);
		
		float total=physics+chemistry+computer;
		System.out.println("Total="+total);

		double average=(total/3)*100;
		System.out.println("Average"+average);

		if(average >=80)
		{
			System.out.println("Division = First");
		}
		else if(average >=60 && average <80)
		{
			System.out.println("Division = Second");
		}
		else if(average>=40  && average <60)
		{
			System.out.println("Division = Third");
		}
   		else
		{
			System.out.println("Division = Fail");
		}
	}
}
            
		