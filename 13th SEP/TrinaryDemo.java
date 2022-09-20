/*
Program : Trenary operator ?:
@author: Sudip Das
@date 13 sep 2022
*/

class TrenaryDemo
{
	static void ifElseEvenOdd(int num)
	{
		if(num%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
		
	}
	
	static void trenaryEvenOdd(int num)
	{
		String result= (num%2==0)? "Even number": "Odd number";
		System.out.println(result);
	}
	
	
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
      //ifElseEvenOdd(number);
      trenaryEvenOdd(number);	  
   }


}


/* Syntax: 
variable = condition? "true":"false";
int greater
int a,b;
if(a>b)
	greater=a; // sop(a)
else
	greater=b; 
greater= (a>b)?a:b;
boolean status;
int voteAge=23;
if(voteAge>18)
{
	
	status=true;
    voteAge++;
	
}
else 
	status=false;
  
status= (voteAge>18)? true:false;
sop(status); */