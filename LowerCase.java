import java.util.*;
class LowerCase
{
     public static void main(String[] args)
     {
         
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a string: ");
          String str = sc.nextLine();
          
          System.out.println("Lower case characters: ");
          for (int i = 0; i< str.length(); i++ )
          {
               if (Character.isLowerCase(str.charAt(i)))
               {
                    System.out.print(str.charAt(i)+", ");
               }
          }
     }
}