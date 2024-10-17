package basic;

public interface Shape {

	void draw();
}
 class Circle implements Shape{

	public static void main(String[] args) {
		Circle circle = new Circle()
		{
			public void draw()
			{
				System.out.println("Iam drwaing a circle");
			}
		};
		Circle square = new Circle()
		{
			public void draw()
			{
				System.out.println("Iam drawing a circle");
			}
		};
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}	
}

