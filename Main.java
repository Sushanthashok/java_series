package Suskkoo;

class A extends Thread{
	int j=0;
	public void run() {
		for(int i=0;i<=10;i++) {
			j=i;
		}
		
	}
}
class R implements Runnable{
	public void run() {
		System.out.println("AuraKanth");
	}
}


public class Main {
	public static void main(String yui[]) {
		A a = new A();
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a.j);
		
		Runnable r = new R();
		Thread t =new Thread(r);
		t.start();
	}
}
















