public class PerformOperations
{
	private static void displayOperations(int num1, int num2)
	{
		int sub=num2-num1;
		int mul=num2*num1;
		int div=num2/num1;

		System.out.println("The addition result"+" "+sub);
		System.out.println("The multiplication result"+""+mul);
		System.out.println("The division result:"+""+div);
	}
	
	public static void main(String args[])
	{
		int num1=10,num2=20;
		displayOperations(num1,num2);		

		
	}
}