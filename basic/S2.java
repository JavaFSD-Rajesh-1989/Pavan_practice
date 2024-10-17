package basic;
class S3 extends Thread
{
	public void run()
	{
		for(int i = 0; i<100; i++)
		{
			System.out.println("hello");
		}
	}
	
}

public class S2 extends Thread{
	
	public void run()
	{
		for(int i = 0; i<100; i++)
		{
			System.out.println("hi");
		}
	}
	
}
 
