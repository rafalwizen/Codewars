//In this kata we want to convert a string into an integer. The strings simply represent the numbers in words.
//
//Examples:
//
//"one" => 1
//"twenty" => 20
//"two hundred forty-six" => 246
//"seven hundred eighty-three thousand nine hundred and nineteen" => 783919
//Additional Notes:
//
//The minimum number is "zero" (inclusively)
//The maximum number, which must be supported is 1 million (inclusively)
//The "and" in e.g. "one hundred and twenty-four" is optional, in some cases it's present and in others it's not
//All tested numbers are valid, you don't need to validate them

package kata;
import java.util.HashMap;

class ParseIntReloaded{
	public static int parseInt(String numStr) {
		if (numStr.equals("zero")) { return 0;}
		if (numStr.equals("million") || numStr.equals("one million")) { return 1000000;}
		
        HashMap<String, Integer> pairs = new HashMap<String, Integer>();
		pairs.put("one", 1);
		pairs.put("two", 2);
		pairs.put("three", 3);
		pairs.put("four", 4);
		pairs.put("five", 5);
		pairs.put("six", 6);
		pairs.put("seven", 7);
		pairs.put("eight", 8);
		pairs.put("nine", 9);
		pairs.put("ten", 10);
		pairs.put("eleven", 11);
		pairs.put("twelve", 12);
		pairs.put("thirteen", 13);
		pairs.put("fourteen", 14);
		pairs.put("fifteen", 15);
		pairs.put("sixteen", 16);
		pairs.put("seventeen", 17);
		pairs.put("eighteen", 18);
		pairs.put("nineteen", 19);
		pairs.put("twenty", 20);
		pairs.put("thirty", 30);
		pairs.put("forty", 40);
		pairs.put("fifty", 50);
		pairs.put("sixty", 60);
		pairs.put("seventy", 70);
		pairs.put("eighty", 80);
		pairs.put("ninety", 90);

		String[] splitted = numStr.split("\\s|-");
		int result = 0;
		int higherResult = 0;
		for (String word : splitted) {
			if(word.equals("hundred")) {
				result *= 100;
			} else if(word.equals("thousand")) {
				higherResult = result * 1000;
				result = 0;
			} else if (pairs.containsKey(word)){
				result = result + pairs.get(word);
			}
		}
		result = result + higherResult;
		return result;
    }
}