import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
	
		char[] grades =new char[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the values");
		
		for(int i=0;i<grades.length;i++)//0 0<3 
		{
			grades[i]=scanner.next().charAt(0);
		}
		
		for(int i=0;i<grades.length;i++)//0 0<3 
		{
			System.out.println(grades[i]);
		}
		
		System.out.println("after changing");
		grades[2]='b';
		
		for(int i=0;i<grades.length;i++)//0 0<3 
		{
			System.out.println(grades[i]);
		}
		
		
			}

}