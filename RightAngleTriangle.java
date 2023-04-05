public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for printing row
		for (int i = 1; i <= 5; i++) {
			 // print spaces
			 for (int j = 1; j <= 5-i; j++) {
				 System.out.print(" "); 
			 }
			 // printing stars
			 for (int k = 1; k <= i; k++) {
				 System.out.print("*");
			 }
			 // move to next line
		   System.out.println();
		}

	}

}

