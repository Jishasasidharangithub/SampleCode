import java.util.Scanner;

public class TwoDimStatic {

	public static void main(String[] args) {
		String[][] names= {
				{"sneha","Bangalore"},
				{"vijay","Mysore"},
				{"Avanija","Hubli"}
				
		} ;
		
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