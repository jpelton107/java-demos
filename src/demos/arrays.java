package demos;

public class arrays {

	public static void main(String[] args) {
		// INTroduction to arrays
		int[] anArray;
		anArray = new int[2];
		
		anArray[0] = 100;
		anArray[1] = 200;
		
		System.out.println("Element at index 0 : " + anArray[0]);
		System.out.println("Element at index 1 : " + anArray[1]);
		
		// multidimensional string array
		String[][] names = {
				{ "Mr", "Mrs", "Ms" },
				{"Smith", "Jones", "Johnson" }
		};
		System.out.println(names[0][0] + " " + names[1][0]);
		System.out.println(names[0][1] + " " + names[1][1]);
		System.out.println(names[0][2] + " " + names[1][2]);
		
		// copy from -> to
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[7];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));
		
		// copy of range
		char[] copy2 = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
		System.out.println(new String(copy2));
	}
}
