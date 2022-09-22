/*
Program: Creating of Cart
@author: Sudip Das
@Date: 21 SEP
*/



class TestCart
{
	public static void main(String ...args)
	{
		//----Constructor injection-------//
		Item pen = new Item ("Ball Pen",3,15);
		Item mobile= new Item("Apple",1, 75000);
		Item chocolate = new Item("Dairy Milk", 20,20);
		Item book = new Item("Computer",3,450);
		Item chips= new Item("Nachos",2,90);
		
		ShoppingCart myCart= new ShoppingCart();
		
		myCart.addItem(pen);
		myCart.addItem(mobile);
		myCart.addItem(chocolate);
		myCart.addItem(book);
		myCart.addItem(chips);
		
		System.out.println("-------------------");
		
		System.out.println("Bill Amount :"+myCart.calculateBill());
		System.out.println("-------------------");
		
		
	}
	
	
