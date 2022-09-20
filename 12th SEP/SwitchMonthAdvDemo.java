/*
Program:Print number of days accrding to the month
@author: Sudip Das
@Date: 9 sep 2022
*/

//declaring a class
class SwitchMonthAdvDemo 
{
	//calling main
	
  public static void main(String[] args)
  {
	
	// 1ST change Java 7 : String can be accepted as variable type
	String monthName= args[0].toLowerCase();
	
		 
	switch(monthName)
	{
		case "january": 
	 	case "march":	
		case "may":
		case "july": 
		case "august": 
		case "october":		
		case "december":System.out.println("Number of days are: 31");
		        break;
		case "february": System.out.println("Number of days are: 28");
		        break;	
        case "april": 
	 	case "june":	
		case "september":
		case "november": System.out.println("Number of days are: 30");
		        break;				
				
		default:System.out.println("Wrong input ");
		        		
		
	}
	// end of switch
		 
  }
 // end of main

}