package basic;

public class BasicStatic {
	String name = "India";
	
	public static void add()
	{
		BasicStatic bs1 = new BasicStatic();
		
		System.out.println("Add me");
		System.out.println(bs1.name);
	}
	public void sub()
	{
		add();
		System.out.println("Subtract me");
		System.out.println(name);
	}
	static {
		System.out.println("vEnkatpavna");
	}
public static void main(String[] args) {
		
		BasicStatic bs = new BasicStatic();
		add();
		bs.sub();
		
	}

}
