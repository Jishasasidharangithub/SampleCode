import java.util.Scanner;

public class Condition6 {

	
	public static void main(String[] args) {
		
	
	Scanner scanner=new Scanner(System.in);
	char ch=scanner.next().charAt(0);
	switch(ch)//9
	{
	case 'a':System.out.println("vowel");
	break;//takes control of switch case 
	case 'e': System.out.println("vowel");
	break;
	case 'i': System.out.println("vowel");
	break;
	case 'o': System.out.println("vowel");
	break;
	case 'u': System.out.println("vowel");
	break;
	case 'A': System.out.println("vowel");
	break;
	case 'E': System.out.println("vowel");
	break;
	case 'I': System.out.println("vowel");
	break;
	case 'O': System.out.println("vowel");
	break;
	case 'U': System.out.println("vowel");
	break;
	
	
	default: System.out.println("Consonet");
	
	}
		
	System.out.println("End of program");
	
	}

}