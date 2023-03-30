public class TernaryOpertor
{
	public static void main(String args[])
	{
		int num1=10,num2=20,num3=5,num4=6,num5=6;
		int res=num2>num3 ? num2 : num3;
		System.out.println(res);

		boolean res1= num2>num3 ? true : false;
		System.out.println(res1);

		String res2= num2>num3 && num4 == num5 ? "True" : "Flase";
		System.out.println(res2);
	}
}