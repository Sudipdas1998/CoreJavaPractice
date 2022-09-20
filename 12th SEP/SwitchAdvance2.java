/*
Program:Print number of days accrding to the month
@author: Sudip Das
@Date: 12 sep 2022
*/

//declaring a class
class SwitchAdvance2
{
	//calling main
	
  public static void main(String[] args)
  {
	// Expression level switch
	
	String game =args[0].toLowerCase();
    //String role=args[1].toLowerCase(); 		 
		 
	switch(game)
	
	{
	   case "football" -> System.out.println("I love football");
	   case "cricket" -> System.out.println("I love cricket");
	   case "badminton"->System.out.println("I love badminton");
	   default -> System.out.println("I love nothing");
	         
							        		
	}
	// end of switch
		 
  }
 // end of main

}