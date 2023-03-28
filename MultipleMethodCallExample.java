class MultipleMethodCallExample
{
private static void displayMessage()
{
System.out.println("Start of displayMessage method");
System.out.println("Method Defination");
System.out.println("end of displayMessage method");
}

public static void main(String[] ar)
{
System.out.println("Start of  main program");
displayMessage();//calling method
System.out.println("----------end of main program-----------");
displayMessage();
displayMessage();
displayMessage();


}

}