import java.util.Scanner;

public class ArrayMethodCall {

	private static void displayChars(char[] ch)
	{
		for(char c : ch)
			System.out.println(c);
	}
	private static char[] increaseGrade(char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
		ch[i]=(char)(ch[i]+1);
		}
		return ch;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	int size;
	System.out.println("enter the size of the array");
	size=scanner.nextInt();
		char[] ch=new char[size];
		
		System.out.println("enter the ELEMENTS of the array");
		for(int i=0;i<ch.length; i++)
		{
			ch[i]=scanner.next().charAt(0);
		}
		
		displayChars(ch);
	
		char[] res=increaseGrade(ch);
		
		for(char r : res)
		{
			System.out.println(r);
		}
}
}