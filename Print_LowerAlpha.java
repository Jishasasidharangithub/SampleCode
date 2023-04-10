import java.util.Scanner;

public class Print_LowerAlpha {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);//for run time values
		System.out.println("enter the name:");
		String str=scanner.nextLine();//storing the data which is entered by the user
		char[] ch=str.toCharArray();//converting string value into char array
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				System.out.print(ch[i]+" ");//printing only lowercase letters from user data
			}
		}
		
	}

}