/*
For Loop
*/

class ForLoopDemo
{
   static void printNumbers(int t)
   {
	   int i;
	   for(i=1;i<=t;i++)
	   {
		   System.out.println(i);
		   
	   }
	   
	    
   }
   
   static void printTable(int num)
   {
	   System.out.println("Printing the table of:"+ num);
	   
	   for(int i=1;i<=10;i++)
	   {
		   System.out.println(num + " X "+ i+ " = "+ (num*i));
	   }
   }
   
   static void infiniteLoop()
   {
	   for(int i=1; i<10;i--)
	   {
		System.out.println(i);   
	   }
	   // to come out of this loop ctrl+C
   }
   
   static void infiniteLoop1()
   {
	   for(;;)
	   
		System.out.println("Hello");  
	   
	   
   }

  public static void main(String ...args)
  {
    
	//int total = Integer.parseInt(args[0]);
	//printNumbers(total);
     //int number = Integer.parseInt(args[0]);
	 //printTable(number);
     // infiniteLoop();
	 infiniteLoop1();
  }


}