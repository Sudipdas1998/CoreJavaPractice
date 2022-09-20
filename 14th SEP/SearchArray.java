/*
Program :Search an element in an array
@uthor: Sudip Das
@Date:   14th Sep
*/

import java.util.Scanner;

class SearchArray
{
  
  static void searchElement(int s, int myArray[])
  {
	  boolean status= false;
	 // print the elements of the array
	 for(int i=0;i<myArray.length;i++)
	 {
		   if(s==myArray[i])
		   {
			   status= true;
		        break;
		   }		
			
			//System.out.println(myArray[i]);
			
	 }
	 
	 if(status)// status==true
	 {
		 System.out.println("Element Found");
	 }
	 else
		System.out.println("Element not found"); 
  }  
	
	static void inputArray()
	{    
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the size of the array:");
	     int size= sc.nextInt();
		 
	     
		int newArray[]= new int[size];
		
		System.out.println("Enter the elements of the array----");
		
		for(int i=0;i<size;i++) // i= i+1
		{
			newArray[i]= sc.nextInt() ;
	
		}
		System.out.println();
		System.out.println("---- Enter the element to be searched-----");
		int number= sc.nextInt();
		
		searchElement(number,newArray); // passing an array 
			
	}
	
	
	
 public static void main(String ... args)
 {
     //traverseArray();  
	
	 inputArray();
 
 }


}