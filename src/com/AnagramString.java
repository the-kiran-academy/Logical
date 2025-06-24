package com;

import java.util.Iterator;

public class AnagramString {

	public static String sortString(String str) {

		String sortedString = "";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length - 1; i++) {

			for (int j = i + 1; j < charArray.length - 1; j++) {

				char previous = charArray[j];
				char next = charArray[j + 1];

				if (previous > next) {
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
				}

			}

		}

		return String.copyValueOf(charArray);

	}

	public static void main(String[] args) {

		String first = "listen";
		String second = "silenst";

		String firstSortedString = sortString(first);
		String secondSortedString = sortString(second);

		System.out.println(firstSortedString);
		System.out.println(secondSortedString);

//		
//		char [] firstarr=first.toCharArray();
//		char [] secondarr=second.toCharArray();
//		
//		Arrays.sort(firstarr);
//		Arrays.sort(secondarr);
//		
//		if(Arrays.equals(firstarr, secondarr)) {
//			System.out.println("Are anagrams ");
//		}

	}

}
