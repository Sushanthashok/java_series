package Suskkoo;
class rectangle{
	int length;
	int breadth;
	void area() {
		int c=length*breadth;
		System.out.println(c);
	}
	void perimeter() {
		int d=2*(length*breadth);
		System.out.println(d);
	}
}

public class peri {
	public static void main(String []args) {
		rectangle r1=new rectangle();
		r1.length=5;
		r1.breadth=5;
		r1.area();
		r1.perimeter();
	}

}
