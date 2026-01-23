package Suskkoo;
class Employee{
	int id;
	String name;
	int salary;
	void annual() {
		int Annual=salary*12;
		System.out.println(Annual);
	}
	
}
public class salary {
	public static void main(String[]args){
		Employee e1= new Employee();
		e1.id=101;
		e1.name="sush";
		e1.salary=20000;
		e1.annual();
		
	}

}
