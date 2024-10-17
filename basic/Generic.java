package basic;

public class Generic<T>{

	T obj;
	Generic(T t){
		obj = t;
		System.out.println(obj);
	}
	void test(T t)
	{
		obj = t;
	}
	T test1()
	{
		return obj;
	}
	public static void main(String[] args) {
		Generic<Integer> ge = new Generic(100);
		Generic<String> ge2 = new Generic("pavan");
		Generic<Boolean> ge3 = new Generic(false);
		
		ge.test(100);
		Integer val = ge.test1();
		System.out.println(val);
		
		ge2.test("Venkat");
		String val2 = ge2.test1();
		System.out.println(val2);
		
		ge3.test(true);
		Boolean val3 = ge3.test1();
		System.out.println(val3);
		
	}
}
