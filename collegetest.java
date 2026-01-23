package Suskkoo;
class College{
	int rollno;
	String name;
	College(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println("rollno,name"+ rollno+name);
	}
}
public class collegetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c1=new College(162,"Sush");
		c1.display();

	}

}
