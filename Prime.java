import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean status=false;
		
		if(num==0 || num==1)
		{
			System.out.println(num+"is not prime number");
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+"is not prime");
					status=true;
					break;
				}
			}
			if(status==false)
			{
				System.out.println(num+"is prime number");
			}

		}
	}
}