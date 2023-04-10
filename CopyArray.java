import java.util.Scanner;

public class CopyArray {

	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	
		int[] number=new int[] {10,20,30};
		
		int[] number1=new int[number.length];
	
		for(int i=0;i<number.length;i++)
		{
			number1[i]=number[i];
		}
		number[2]=90;
		for(int n1 : number1)
		{
			System.out.println(n1);
		}
}
}