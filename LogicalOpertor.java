public class LogicalOpertor
{
	public static void main(String args[])
	{
		int num1=10,num2=20,num3=5,num4=6,num5=6;
		boolean res=(num1>num2) &&(num4==num5);
		System.out.println(res);
		
		boolean res1=(num1>num2) || (num4==num5);
		System.out.println(res1);

		System.out.println(! res1);
	}
}