import java.util.Scanner;
public class Temperature{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int  temperature = sc.nextInt();

		if(temperature<=30)
		{
			System.out.println("Weather is cool");
		}
		else if(temperature>30 && temperature<=45)
		{
			System.out.println("Normal temperature");
		}
		else
		{
			System.out.println("Weather is hot");
		}
	}
}

		
	