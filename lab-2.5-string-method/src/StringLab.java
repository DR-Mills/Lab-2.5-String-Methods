

public class StringLab {

	public static void main(String[] args) {
		
		String [] testStrings = {"mOnKeY", "POLAR BEAR", "Only Waldo (and Clara) would say Math is fun!"};
		
		for (String str : testStrings) {
		System.out.println(
				StringMethods.capitalize(str) + " " +
				StringMethods.wheresWaldo(str) + " " +
						
				);
		}
		System.out.println();
		
		

	}

}