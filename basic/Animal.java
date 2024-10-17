package basic;

public class Animal {

 static abstract class Animals{
	 
	 abstract void sound();
 }
 
 public static void main(String[] args) {
	Animals cat = new Animals() {
		
		@Override
		void sound() {
			System.out.println("Cat: Meow");
		}
	};
	
	Animals dog = new Animals() {
		void sound() {
			System.out.println("Dog: Bow");
		}
	};
	
	cat.sound();
	dog.sound();

}
}