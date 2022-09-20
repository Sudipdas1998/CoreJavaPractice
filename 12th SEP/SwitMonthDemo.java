/*
Program:Print number of days accrding to the month
@author: Sudoip Das
@Date: 9 sep 2022
*/

//declaring a class
class SwitchMonthDemo 
{
	//calling main
	
  public static void main(String[] args)
  {
	
	//char grade = Character.parseCharacter
		
     int monthNumber = Integer.parseInt(args[0]);
	 
	switch(monthNumber)
	{
		case 1: 
	 	case 3:	
		case 5:
		case 7: 
		case 8: 
		case 10:		
		case 12:System.out.println("Number of days are: 31");
		        break;
		case 2: System.out.println("Number of days are: 28");
		        break;	
        case 4: 
	 	case 6:	
		case 9:
		case 11: System.out.println("Number of days are: 30");
		        break;				
				
		default:System.out.println("Wrong input ");
		        		
		
	}
	// end of switch
		 
  }
 // end of main

}
