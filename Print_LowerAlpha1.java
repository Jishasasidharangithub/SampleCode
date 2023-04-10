import java.util.Scanner;

public class Print_LowerAlpha1 {

	public static void main(String[] args) {
		String name=null;
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the name");
		name=scanner.next();
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);//pavitra  p 
			if(ch>=97 && ch<=122)
				System.out.println(ch);
		}
		
	}

}