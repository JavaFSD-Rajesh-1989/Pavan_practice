package basic;
public class Base2 {
	static int c ;
	static int add(int a, int b) {
		c = a + b;
		return c;
	}
	public static void main(String[] args) {
		int ans = add(25,68);
		System.out.println(ans);
	}
}