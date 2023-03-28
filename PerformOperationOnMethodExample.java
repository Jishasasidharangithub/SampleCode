class PerformOperationOnMethodExample
{
private static void displayMessage(int number)
{
System.out.println(number+200);
}
private static int addNumbers(int number,int number2)
{
return number+number2;
}
public static void main(String[] ar)
{
int number=200,number2=50;
System.out.println("Start of  main program");
displayMessage(number);//calling method
System.out.println("----------end of main program-----------");
int res=addNumbers(number,number2);
System.out.println("result  "+res);
//displayMessage();
//displayMessage();
//displayMessage();


}

}