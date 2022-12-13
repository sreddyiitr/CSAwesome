public class RightAlignedPyramid
{
	public static void main(String args[])
	{
	    int totalNumberOfRows = 4;
	    
		// Outer For Loop (Rows)
		for(int i=1; i <= totalNumberOfRows; i++)
		{
      
			/* Inner For Loop (To print space)
			   No of spaces in each row = (totalNumberOfRows - RowNumber) where RowNumber is i 
			   Example: 3 spaces in Row 1 (4-1), 2 spaces in row 2 (4-2) etc 
			*/
			for(int j=(totalNumberOfRows-i); j>=1; j--)
			{
				System.out.print(" ");
			}

			// Inner For Loop (To print star)
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}

			// ending line after each row
			System.out.println();
		}
	}
}
