

public class StringLab {

	public static void main(String[] args) {
		
		String [] testStrings = {"MOnKeY", "POLAR BEAR", "Only Waldo (and Clara) would say Math is fun!"};
		
		for (String str : testStrings) {
		System.out.println(
				StringMethods.capitalize(str) + " " +
				StringMethods.wheresWaldo(str) + " " +
				StringMethods.afterMath(str) + " " +
				StringMethods.camelCase(str));

		}
		System.out.println(StringMethods.firstThingsFirst(testStrings[0], testStrings[1]));
		System.out.println(StringMethods.reverse(testStrings[1]));
		System.out.println(StringMethods.soLong(testStrings[0], testStrings[1]));
		StringMethods.letterize(testStrings[0]);
	}

}

