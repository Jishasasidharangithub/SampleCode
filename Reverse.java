import java.util.Scanner;
public class Reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev=0;

		for(;num != 0;num=num/10)
		{
			int remainder=num%10;
			rev=rev*10+remainder;
		}
	System.out.println("Reverse of number:"+rev);
	}
}
			