/*
Program: IfEleseDemo2
@author:Sudip Das
@Date: 12sept2022

*/

//declaring class
class IfEleseGrade
{
     //calling main method
	 public static void main(String[] args)
	 {
	   
	   
	   int number= Integer.parseInt(args[0]);
	   
        //comparing the marks
		if((number>=80)&&(number<100))
		{
		     System.out.println("You got A grade");
		}
		else if((number>=60)&&(number<80))
		{
       		System.out.println("You got B grade");
		}	  
		else if((number>=50)&&(number<60))
		{
			System.out.println("You got C grade");
		}
	   else if((number>=45)&&(number<50))
	   {
	   System.out.println("You got D grade");
	   }
	   else if((number>=25)&&(number<45))
	   {
		System.out.println("You got E grade");
	   }
	   else if(number<25)
	  {
		System.out.println("You got F grade");
	  }
       else
	   {
		   System.out.println("invalid");
	   }
	   
	 }
	 //end of main
	 
}
//end of class 
