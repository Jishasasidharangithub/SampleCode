import java.util.Scanner;
public class MultipleTable{
	public static void main(String args[]){

		Scanner scanner=new Scanner(System.in);
		System.out.println("Ente the number");
		int tableNo=scanner.nextInt();
	
	//WAP to print 2's table 
		//initialization 
		
		for(int num=1; num<=10; num++)//4  4<=20 
		{
			System.out.println(tableNo + "*" +num+" = "+tableNo*num);//2 4
		// 2 4 6 8 10 12 14 16 18 20
		}
	}
}