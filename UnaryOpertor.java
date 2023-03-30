public class UnaryOpertor
{
	public static void main(String args[])
	{
		int num1=10,num2=20,num3=5,num4=6,num5=6;
		num5= -num3;  //minus operation
		System.out.println(num5);

		num5=num1+num2; //concatenation
		System.out.println(num5);

		num2=num1++; //post increment
		System.out.println("The result ---->" +num2+ " "+num1);

		num2=++num1; //pre increment
		System.out.println("The result ---->" +num2+ " "+num1);
	}
}