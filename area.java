package Suskkoo;
class circle{
	int radius;
	
	void area() {
		double a=3.14*(radius*radius);	
		System.out.println(a);
		}
	void circum() {
		double b=2*3.14*radius;
		System.out.println(b);
		
	}
}
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1=new circle();
		c1.radius=5;
		c1.area();
		c1.circum();

	}

}
