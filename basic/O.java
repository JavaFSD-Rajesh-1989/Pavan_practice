package basic;

public class O implements M,N{
	public void show()
	{
		System.out.println("Iam from O");
	}

	public static void main(String[] args) {
		O o1 = new O();
		o1.show();
		
		
	}
}
