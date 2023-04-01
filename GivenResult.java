import  java.util.Scanner;
public class GivenResult{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println("Enter grade:"+ch);
		
		if(ch == 'E')
			System.out.println("Excellent");
		else if(ch == 'V')
			System.out.println("Very Good");
		else if(ch == 'G')
			System.out.println("Good");
		else if(ch == 'A')
			System.out.println("Average");
		else
			System.out.println("Fail");	
	}
}	