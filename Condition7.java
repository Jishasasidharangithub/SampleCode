import java.util.Scanner;

public class Condition7 {

	
	public static void main(String[] args) {
		
	 
	Scanner scanner=new Scanner(System.in);
	char ch=scanner.next().charAt(0);
	switch(ch)//9
	{
	case 'a': 
	case 'e': 
	case 'i': 
	case 'o': 
	case 'u': 
	case 'A': 
	case 'E': 
	case 'I': 	
	case 'U': System.out.println("vowel");
	break;
	
	
	default: System.out.println("Consonet");
	
	
	
	}
		
	System.out.println("End of program");
		
//	scanner.close();
	
	
	
	
	
	
	
	
	}

}