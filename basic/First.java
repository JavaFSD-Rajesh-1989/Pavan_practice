package basic;

public interface First {
	abstract void test();
	public  void test2();
	default void test3()
	{
		System.out.println("Iam from test3");
	}
	
}
