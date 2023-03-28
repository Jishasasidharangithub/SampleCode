import java.util.Scanner;  
class ReadDataExample 
{ 
	public static void main(String[] arg) 
	{ 
		float value; 
		Scanner scanner = new Scanner(System.in);
	 	System.out.println("enter the floating point value"); 
		value=scanner.nextFloat(); 
		System.out.println("float value is  "+value); 
		boolean status=scanner.nextBoolean();//reads the boolean value 
 		String str=scanner.next();//reading string value 
		double salary = scanner.nextDouble(); 
		char grade=scanner.next().charAt(0); 
		System.out.println(value); 
		System.out.println(status); 
		System.out.println(str); 
		System.out.println(salary); 
		System.out.println(grade);  
	}
 }