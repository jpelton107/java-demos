package demos;

public class Continue {
	public static void main(String[] args){
		String searchContent = "peter piper picked a peck of pickled peppers";
		int max = searchContent.length();
		int numPs = 0;
		
		for(int i = 0; i < max; i++) {
			if (searchContent.charAt(i) != 'p')
				continue;
			
			numPs++;
		}
		System.out.println("Found " + numPs + " p's in the string");
	}
}

