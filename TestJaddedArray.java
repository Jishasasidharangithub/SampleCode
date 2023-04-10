import java.util.Scanner;

public class TestJaddedArray {

	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	
		int[][] number=new int[3][];
		
		number[0]=new int[] {10,20};
		number[1]=new int[] {100,200,300};
		number[2]=new int[] {1,2,3,4};
		
		System.out.println("enter the ELEMENTS of the array");
		
		for(int[] n1 : number)
		{
			for(int n: n1)
			{
				System.out.print(n);
			}
			System.out.println();
		}
		
}
}