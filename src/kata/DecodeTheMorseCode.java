// Link to this task:
// https://www.codewars.com/kata/54b724efac3d5402db00065e

package kata;

public class DecodeTheMorseCode {

	public class MorseCodeDecoder {
	    public static String decode(String morseCode) {
			String[] splitted = morseCode.trim().split("\\s{3,3}");
			String result = "";
			for (String word : splitted) {
				String[] splittedWord = word.split("\\s");
				for (String letter : splittedWord) {
					result = result + MorseCode.get(letter);
				}
				result = result + " ";
			}
			result = result.trim();		
			return result;
		}
	}	
}
