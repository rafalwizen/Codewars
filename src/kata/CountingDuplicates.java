//Count the number of Duplicates
//Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//
//Example
//"abcde" -> 0 # no characters repeats more than once
//"aabbcde" -> 2 # 'a' and 'b'
//"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//"indivisibility" -> 1 # 'i' occurs six times
//"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//"aA11" -> 2 # 'a' and '1'
//"ABBA" -> 2 # 'A' and 'B' each occur twice

package kata;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

	public static int duplicateCount(String text) {
		String loweCased = text.toLowerCase();
		HashMap<Character, Integer> list = new HashMap<Character,Integer>();
		for (int i = 0; i < loweCased.length(); i++) {
			if(list.containsKey(loweCased.charAt(i))) {
				list.put(loweCased.charAt(i), list.get(loweCased.charAt(i)) + 1);
			} else {
				list.put(loweCased.charAt(i), 1);
			}
		}
		int result = 0;
		for(Map.Entry<Character, Integer> entry : list.entrySet()) {
			if(entry.getValue() >= 2) {
				result++;
			}
		}
		return result;
	  }
}
