public class Multi2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// loop through tables 2 to 10

		for (int i = 2; i <= 10; i++) { 
			System.out.println("Table of " + i + ":");
			// loop through multipliers 1 to 10
			 	for (int j = 1; j <= 10; j++) { 
			 		System.out.println(i + " x " + j + " = " + i*j);
			 	}
			 System.out.println(); 
			 }

	}

}
