/*
Program: Break and Continue
*/

class BreakContinueDemo
{
  static void printNumbers()
  {
	  for(int i=1; i<=10;i++)
	  {
		  if(i==5)
		  {
			  break;
		  } 			  
		  System.out.println(i);
		  
	  }
	  
  }
  static void printNumbers1()
  {
	  for(int i=1; i<=10;i++)
	  {
		  
		  if(i==5)
		  {
			  continue;
		  } 			  
		 System.out.println(i);
		  
	  }
	  
  }  
  
   static void printNumbers2() // unlabeled break and continue
   {
	   for(int i=1;i<=3;i++)
	   {
		   System.out.println();
		   for(int j=1;j<=3;j++)
		   {
			   if(i<=j)
				   break; // breaking only the inner loop
			   System.out.print(i+""+j+ "  ");
		   }
	   }
	   
	   
   }
  
  static void printNumbers3() // labeled break and continue
   {
	  outerLoop: for(int i=1;i<=3;i++)
	   {
		   System.out.println();
		   for(int j=1;j<=3;j++)
		   {
			   if(i==j)
				continue outerLoop;
			   System.out.print(i+""+j+ "  ");
		   }
	   }
	   
	   
   }
  
	
  public static void main(String ... args)
  {
	  System.out.println("Continue statement");
	  printNumbers2();
	   System.out.println("Continue statement with labeled block");
	  printNumbers3();
  
  }


}