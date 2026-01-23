package Suskkoo;
class Mobiletest{
	String brand;
	int ram;
	int price;
	void display() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(ram);
	}
}
public class mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mobiletest m1=new Mobiletest();
       m1.brand="vivo";
       m1.ram=8;
       m1.price=20000;
       
       Mobiletest m2=new Mobiletest();
       m2.brand="oppo";
       m2.ram=8;
       m2.price=20200;
       if(m1.price<m2.price){
    	   m2.display();
    	   
       }else {
    	   m1.display();
       }
	}

}
