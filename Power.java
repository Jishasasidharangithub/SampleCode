import java.util.Scanner;
public class Power{

	public static int powerOfNumber(int base,int exponent){
		int power=1;
		for(int i=1;i<=exponent;i++)
		{
			power=base*power;
		}
		return power;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base:");
		int base = sc.nextInt();
		System.out.println("Enter exponent:");
		int exponent = sc.nextInt();

		int pow=powerOfNumber(base,exponent);
		System.out.println("Power of the given number:"+pow);
	}
}
		

		