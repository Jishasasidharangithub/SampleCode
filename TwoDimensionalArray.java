public class TwoDimensionalArray {

	public static void main(String[] args) {
		//static two dimensional array
		//datatype[][] varname={intialize};
		
		//dynamic two dimensional array
		//datatype[][] variablename = new datatype[row][column];
		int[][] marks= {
			//	0th 1st 2nd
				{10,12,13},//0th  row
				{20,17,12},//1st row
				{19,18,13}//3nd row
		};
		
		System.out.println(marks[0][0]);
		System.out.println(marks[0][1]);
		System.out.println(marks[0][2]);
		System.out.println(marks[1][0]);
		System.out.println(marks[1][1]);
		System.out.println(marks[1][2]);
		System.out.println(marks[2][0]);
		System.out.println(marks[2][1]);
		System.out.println(marks[2][2]);
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
				
			{
				System.out.print(marks[row][col]+" ");
			}
			System.out.println();
		}
		
		for(int[] n : marks)
		{
			for(int n1 : n)
			{
				System.out.print(n1+" ");
			}
			System.out.println();
		}
		
		//1
		//2 3
		//1 3
		//3 3
		//7 3
		
		
	}

}