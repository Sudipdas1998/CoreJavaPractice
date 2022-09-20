/*
Program :firstPattern
*
*
*
second pattern
*         i=1
* *         2
* * *       3 
* * * *     4
println(new line)
print(no new line) 
@author: Sudip Das
@date 13 sep 2022
*/

class PatternDemo
{
	static void firstPattern(int num)
	{
		for(int i=1; i<=num;i++)
		{
			System.out.println("*");
		}
		
	}
	
	static void secondPattern(int  numOfRows)
	{
		// printing numbers
		for(int i=1;i<=numOfRows;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
		}
		
		
	}
	
	static void thirdPattern(int  numOfRows)
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
		
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
	  //firstPattern(number);
	  secondPattern(number);
      
   }


}
