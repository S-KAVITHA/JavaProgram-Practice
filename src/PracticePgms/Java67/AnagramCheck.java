package PracticePgms.Java67;

import java.util.Arrays;

public class AnagramCheck {

	public static boolean isAnagram(String str1, String str2) {
		// comparing length
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toLowerCase());

		if (str1.length() != str2.length()) {
			// returns false if the strings are not equal in length
			return false;
		}
		// converts string into character array
		char[] chars = str1.toCharArray();
		// loop iterates over the array
		for (char c : chars) {
			// finds the index
			int index = str2.indexOf(c);
			if (index != -1) {
				// the substring() method returns a new string that is a substring of this
				// string
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
			} else {
				return false;
			}
		}
		return str2.isEmpty();
	}

	public static boolean isAnagram1(String str1, String str2) {
		str1.toLowerCase();
		str2.toLowerCase();
		char[] arrayStr1 = str1.toCharArray();
		char[] arrayStr2 = str2.toCharArray();
		
		Arrays.sort(arrayStr1);
		System.out.println(arrayStr1);
		Arrays.sort(arrayStr2);
		System.out.println(arrayStr2);
		
		
		if (Arrays.equals(arrayStr1,arrayStr2)) {
			return true;
		} else
			return false;
	}

	public static void main(String args[]) {
		// calling function
		System.out.println(isAnagram("HEART", "EARTH"));
		System.out.println(isAnagram("TRIANGLE", "INTEGRAL"));
		System.out.println(isAnagram("TOSS", "SHOT"));
		System.out.println("--------------------------");
		System.out.println(isAnagram1("HEART", "EARTH"));
		System.out.println(isAnagram1("TRIANGLE", "INTEGRAL"));
		System.out.println(isAnagram1("TOSS", "SHOT"));

	}
}