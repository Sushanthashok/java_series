package Suskkoo;
class Book{
String Title;
String Author;
int price;
void display() {
	System.out.println("title"+Title);
	System.out.println("author"+Author);
	System.out.println("price"+price);
   	
}

}

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] arr = new Book[3];
		Book b1=new Book();
		b1.Title="harry";
		b1.Author="tom";
		b1.price=2000;
		
		Book b2=new Book();
		b2.Title="harrrry";
		b2.Author="toom";
		b2.price=2000;
		
		Book b3=new Book();
		b3.Title="harrry";
		b3.Author="tommy";
		b3.price=2000;
		
		  arr[0] = b1;
	        arr[1] = b2;
	        arr[2] = b3;
	        for (int i = 0; i < arr.length; i++) {
	            arr[i].display();
	        }
	    

	        // Print details using array
	       
	}

}
