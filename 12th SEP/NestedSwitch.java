/*
Program:Nested Switch example
@author: Sudip Das
@Date: 9 sep 2022
*/

//declaring a class
class NestedSwitch
{
	//calling main
	
  public static void main(String[] args)
  {

	
	String game =args[0].toLowerCase();
    		 
	switch(game)
	
	{
	   case "football" :   String role=args[1].toLowerCase(); 
	                       System.out.println("I love football");
	                       switch(role)
	                       {
							   case "keeper": System.out.println("I am a goalkeeper");
							                  break;
                               case "striker": System.out.println("I am a striker");
							                  break;										  
		                         default: System.out.println("I am allrounder");
	                       }
                           break; 	   
                           
	   case "cricket" : System.out.println("I love cricket");
	                    break;
	   case "badminton" :System.out.println("I love badminton");
	                      break;
	   default : System.out.println("I love nothing");
	         
							        		
	}
	// end of switch
		 
  }
 // end of main

}