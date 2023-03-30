public class BitwiseOpertor
{
	public static void main(String args[])
	{
		int num1=8;
		int res=num1<<3;   //left shift
		System.out.println(res);

		int num2=8;
		int res1=num2>>2;  // right shift
		System.out.println(res1);

		int num3=8;
		int num4=4;
		int res3= num3 & num4;  //shorthand AND
		System.out.println(res3);

		int num5=8;
		int num6=4;
		int res4= num5 | num6; //shorthand OR
		System.out.println(res4);

		int num7=8;
		int num8=4;
		int res5= num7 ^ num8; // XOR
		System.out.println(res4);
	}
}