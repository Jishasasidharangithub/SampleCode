public class PrintAa_Zz{
	public static void main(String args[]){

	//aA bB cC dD eE fF gG h i ......zZ
		//Multi initialization for loop

		for(char ch='z',alpha='Z'; ch>='a';ch--,alpha--)
		{
			System.out.print(ch+""+alpha+" ");
		}
	}
}