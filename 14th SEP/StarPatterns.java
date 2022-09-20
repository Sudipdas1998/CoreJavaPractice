/*
Program :firstPattern
*
*
*
println(new line)
print(no new line) 
@author: Sudip Das
@date 14 sep 2022
*/

class StarPatterns
{
	/*
	*
	*
	*
	*/
	static void firstPattern(int num)
	{
		for(int i=1; i<=num;i++)
		{
			System.out.println("*");
		}
		
	}
	/*
	*
	* *
	* * *
	* * * *
	*/
		
	static void secondPattern(int  numOfRows)
	{
		// printing stars
		for(int i=1;i<=numOfRows;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
		
		
	}
	/*
	* * * *
	* * *
	* *
	*
	*/
	static void thirdPattern(int  numOfRows)
	{
		// printing stars
		for(int i=1;i<=numOfRows;i++)
		{
			System.out.println();               
			for(int j=numOfRows;j>=i;j--)       
			{
				System.out.print("* ");
			}
		}
		
		
	}
	
	/*
	*
	* *
	* * *
	* *
	*
	*/
	static void fourthPattern(int  numOfRows)
	{
		// printing stars
		for(int i=1;i<=numOfRows;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
		for(int i=2;i<=numOfRows;i++)
		{
			System.out.println();               
			for(int j=numOfRows;j>=i;j--)       
			{
				System.out.print("* ");
			}
		}
		
		
	}
		
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
	  //firstPattern(number);
	 // secondPattern(number);
	 //thirdPattern(number);
      fourthPattern(number);
      
   }


}