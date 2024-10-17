package thread;

public class Thread1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.start();
		System.out.println(e1.activeCount());
		
		Manager m1 = new Manager();
		m1.start();
		
	}

}
class Employee extends Thread{
	
	public void run() {
		for(int i = 0; i< 1000; i++) {
			System.out.println("i value is: "+i);
		}
	}
}
class Manager extends Thread{
	public void run()
	{
		for(int j = 0; j<=1000; j++)
		{
			System.out.println("j value is:" + j);
		}
	}
}
