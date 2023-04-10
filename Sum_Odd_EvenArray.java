import java.util.Scanner;
public class Sum_Odd_EvenArray 
{
    public static void main(String[] args) 
    {
        int n, sumEven = 0, sumOdd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 == 0)
            {
                sumEven = sumEven + arr[i];
            }
            else
            {
                sumOdd = sumOdd + arr[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumEven);
        System.out.println("Sum of Odd Numbers:"+sumOdd);
    }
}