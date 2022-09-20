/*
println(new line)
print(no new line) 
@author: Sudip Das
@date 14 sep 2022
*/

class StarsPattern2
{

	
	/*	
	   *
	  * *
	 * * *
	* * * * 
	*/
	
	static void starPattern(int noOfRows)
	{
		for(int i=1;i<=noOfRows;i++) // outer loop for my rows
		{
			System.out.println(); // new line after each row
			
			for(int spaces=noOfRows;spaces>i;spaces--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			
		}
		
		
	}
	
		
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
	  starPattern(number);
      
   }


}