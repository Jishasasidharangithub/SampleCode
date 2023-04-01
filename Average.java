import java.util.Scanner;

public class Average {

	
	public static void main(String[] args) {
		
		//Average of even numbers between 1 to 100 
		
		/*
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("Ente the number"); int tableNo=scanner.nextInt();
		 */
		int sum=0,count=0;
		float average=0.0f;
		int num;
	
		for(num=1;num<=100;num++)//3   3<=100  2 4 5
		{
			if(num%2==0)//1%2==0  false   2%2==0 3%2==0
 			{
				sum=sum+num;//0=0+2=2 2=2+4 6
				count++;//2
			}
			
		}
		average=sum/count;
			System.out.println(sum+"           "+average+"          "+count);
	}

}