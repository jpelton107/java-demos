package demos;

public class EnhancedFor {
	public static void main(String[] args) {
		String[][] names = {
				{"Joel", "Rachelle", "Elijah", "Jaemily"},
				{"Sam", "Micah","Luke"},
				{"Mom", "Dad"},
				{"Jimmy","Alyssa","Ella","Hayden"},
				{"Anna","Jeo"}
		};
		int i;
		int j = 0;
		boolean found = false;
		
	search:
		for (i = 0; i < names.length; i++) {
			for (j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j]);
				if (names[i][j] == "Ella") {
					found = true;
					System.out.println("Found " + names[i][j] + " at " + i + ", " + j);
					break search;
				}
			}
		}
	}
}
