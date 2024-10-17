package basic;

public class Ac {
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable()
				{
					public void run()
					{
						System.out.println("This is anonymous innerclass");
					}

				};
				
				Thread thread = new Thread(runnable);
				thread.start();
	}

}
