package demos;

class Parent {} 
class Child extends Parent implements MyInterface {}
interface MyInterface {}

public class operators {
	public static void main(String[] args) {
		// compare ints
		int a = 100;
		int b = 50;
		isEqual(a, b);
		
		b = b * 2;
		isEqual(a, b);
		
		// concat Strings
		String string_a = "Clause 1";
		String string_b = "Clause 2";
		String new_string = concat(string_a, string_b);
		System.out.println(new_string);
		
		// invert boolean
		boolean status = false;
		System.out.println("Before: " + status);
		status = invert(status);
		System.out.println("After: " + status);
		
		// ?:
		String result = status ? "Looks like it is true" : "Looks like it is false";
		System.out.println(result);
		
		// instanceof comparison
		Parent dad = new Parent();
		Parent son = new Child();
		
		System.out.println("dad instance of Parent: " + (dad instanceof Parent));
		System.out.println("dad instance of Child: " + (dad instanceof Child));
		System.out.println("dad instance of MyInterface: " + (dad instanceof MyInterface));
		System.out.println("son instance of Parent: " + (son instanceof Parent));
		System.out.println("son instance of Child: " + (son instanceof Child));
		System.out.println("son instance of MyInterface: " + (son instanceof MyInterface));
		
		// bit demo
		int bitmask = 0x000F;
		int val = 0x2222;
		System.out.println(val & bitmask);

	}
	
	private static void isEqual(int a, int b) {
		if (a == b) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is NOT equal to b");
		}
	}
	
	private static String concat(String a, String b) {
		return a + b;
	}
	
	private static boolean invert(boolean status)
	{
		return !status;
	}
}
