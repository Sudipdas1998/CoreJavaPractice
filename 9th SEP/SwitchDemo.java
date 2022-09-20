/*
Program: Switch
@author:Sudip Das
@Date: 9sept2022

*/

//declaring class
class SwitchDemo
{
     //calling main method
	 public static void main(String[] args)
	 {
	   
	   int number= Integer.parseInt(args[0]);
	   switch(number)
	   {
	        case 1: System.out.println("Monday");
					break;
			case 2: System.out.println("Tuesday");
					break;
			case 3: System.out.println("Wednesday");
					break;
			case 4: System.out.println("Thersday");
					break;
			case 5: System.out.println("Friday");
					break;
			case 6: System.out.println("Saturday");
					break;
			case 7: System.out.println("Sunday");
					break;
			default:System.out.println("Wrong input");
	   }
	   
	 }
	 
	 //end of switch
	 
}
//end of main