//Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
//
//Your task is to process a string with "#" symbols.
//
//Examples
//"abc#d##c"      ==>  "ac"
//"abc##d######"  ==>  ""
//"#######"       ==>  ""
//""              ==>  ""

package kata;

public class BackspaceInString {

	public String cleanString(String s) {
		String result = s;		
		while(result.contains("#")) {			
			result = result.replaceAll("^#+|[^#]#", "");
		}		
		return result;
	}
}
