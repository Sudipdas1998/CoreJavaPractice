/*
Program : Traversing an array
@uthor: Sudip Das
@Date:   14th Sep
*/

import java.util.Scanner;

class TraverseArray
{
  static void traverseArray()
  {
	  int myArray[] = {1,2,3,4,6,7};
	 System.out.println("Elements of array are :");
	 
	 // print the elements of the array
	 for(int i=0;i<myArray.length;i++)
	 {
		 System.out.println(myArray[i]);
	 }
  }  
	
	static void inputArray(int num)
	{    
	     int j=2;
		int newArray[]= new int[num];
		for(int i=0;i<num;i++) // i= i+1
		{
			newArray[i]= j ;// storing even numbers in the array
			j=j+2;
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Elements of array are :");
	 
		for(int i=0;i<num;i++)
	 {
		 System.out.println(newArray[i]);
	 }
		
	}
	
	
	
 public static void main(String ... args)
 {
     //traverseArray();  
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the size of the array:");
	 int size= sc.nextInt();
	 inputArray(size);
 
 }


}