package PracticePgms.Java67;

import java.util.ArrayList;
import java.util.Arrays;

import PracticePgms.SysoutPgm;

public class ReverseWords {

	public static void main(String args[]) {
		String text = new String("This is good book");
		System.out.println(reverseWords(text).trim());

		String s2 = "I love Java Programming";
		System.out.println(reverseWords(s2).trim());
	}

	public static String reverseWords(String text) {
		String[] temp = text.split("\\s");

		System.out.println(Arrays.toString(temp));
		System.out.println(temp.length);
		int length = temp.length;
		length = length - 1 ;
		System.out.println(length);
		String result = "";
		
		for (int i = length  ; i >= 0; i--) {
			
			if (result != null) {
				result = result + " " + temp[i];
			} else {
				result = temp[i];
			}
		}

		return result;
	}

}
