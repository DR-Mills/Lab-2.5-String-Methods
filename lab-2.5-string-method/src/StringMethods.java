/*
Task: Create a class named StringLab. Add the standard main method.

Add the following public static void methods, and call each one at least once from your main
method to test them.
1. capitalize(String word) -takes a word and prints it out with the first letter capitalized
and all other letters lowercase.
 
2. wheresWaldo(String phrase) - takes a string and prints the location (index) in the
string where the word ?Waldo? first appears.

3. firstThingsFirst(String a, String b) - takes two strings, prints the string that comes
first alphabetically, then prints the other.

4. reverse(String s) - takes a string and prints it backwards
E.g. for ?happy?, it prints ?yppah?.

5. soLong(String a, String b) - prints only the longer of the two strings. If both strings are
the same length, print both.

6. afterMath(String phrase) - takes a phrase. If the phrase contains the word math, it
prints the rest of the phrase starting with math. If not, it prints ?dud?.

7. letterize(String word) - takes a word. Prints it out one letter per line. Hint: Use a loop.

Extended Challenges
* For capitalize, wheresWaldo, firstThingsFirst, reverse, and afterMath return the
result rather than printing it. Then print it in the main method instead.
* Put all these methods in a separate StringMethods class and still call them from your
main method in StringLab.
* Create a camelCase method. It takes in a phrase and turns it into a camel case variable
name.
E.g. for ?desert survival skills?, it prints ?desertSurvivalSkills?
*/

public class StringMethods {

	// Methods
	public static String capitalize(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
	}

	public static int wheresWaldo(String phrase) {
		return phrase.indexOf("Waldo");
	}

	public static String firstThingsFirst(String strA, String strB) {
		if (strA.compareTo(strB) <= 0) {
			return strA + " " + strB;
		} else {
			return strB + " " + strA;
		}
	}

	//not working
	public static String reverse(String s) {
		String reverseWord = "";
		for (int i = s.length(); i < 0; i--) {
			reverseWord += s.charAt(i);
			System.out.println(s.charAt(i));
		}
		return reverseWord;
	}

	public static String soLong(String a, String b) {
		if (a.length() > b.length()) {
			return a;
		} else if (a.length() < b.length()) {
			return b;
		}
		return a + " " + b;
	}

	public static String afterMath(String phrase) {
		String phraseToLowerCase = phrase.toLowerCase();
		int indexOfMath = phraseToLowerCase.indexOf("math");
		if (indexOfMath < 0) {
			return "dud";
		} else {
			return phrase.substring(indexOfMath);
		}
	}

	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

	public static String camelCase(String phrase) {
		String tempString = "";
		String lowerCasePhrase = phrase.toLowerCase();
		String[] tempStrArray = lowerCasePhrase.split(" ");
		tempString += tempStrArray[0];
		for (int i = 1; i < tempStrArray.length; i++) {
			tempString += capitalize(tempStrArray[i]);
		}
		return tempString;
	}
}
