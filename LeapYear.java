import java.util.Scanner;
public class LeapYear{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		if((year%4 == 0 && year%100 != 0) || (year==400))
		{
			System.out.println(year+",This is leap year");
		}else
		{
			System.out.println(year+",This is not a leap year");
		}
	}

}