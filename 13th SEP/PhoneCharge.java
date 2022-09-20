/*
Program: Phone Charging Demo
@author: Sudip Das
@Date: 13 sept 2022
*/

class PhoneCharge
{ 
    static void startCharging(int batteryLife)
	{
		while(batteryLife<100)
		{
			System.out.println("------Charging-----"+batteryLife);
			batteryLife+= 15;
			if(batteryLife>=100)
				break;
			
		}
		if(batteryLife>=100)
		{
			System.out.println("------Your phone is completely charged(100%)-----");
		}
		
		
	}
   
   public static void main(String... args)
   {
      int battery= Integer.parseInt(args[0]);
	  startCharging(battery);
   
   }



}