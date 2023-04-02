import java.util.Scanner;
public class EvenOddSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
  		int num=sc.nextInt();
		int oddSum=0;
		int evenSum=0;

		for(;num != 0;num=num/10)
		{
			int remainder=num%10;
			if(remainder%2==0)
			{
				evenSum += remainder;
			}
			else
			{
				oddSum += remainder;
			}
		}
		System.out.println("Even sum="+evenSum);
		System.out.println("Odd sum="+oddSum);
	}
}
