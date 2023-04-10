import java.util.Scanner;

public class TwoDimDynamic {

	public static void main(String[] args) {
		String[][] names= new String[3][2];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the student name with cityname");
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				names[i][j]=scanner.next();
			}
		}
		
		//normal for loop
		for(int i=0;i<names.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(names[i][j]+" ");
			}
			System.out.println();
		}
		
		for(String[] values : names )
		{
			for(String s1 : values)
			{
				System.out.print(s1+" ");
			}
			System.out.println();
		}
		
	}

}