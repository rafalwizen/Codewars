//Return the century of the input year. The input will always be a 4 digit string, so there is no need for validation.
//
//Examples
//"1999" --> "20th"
//"2011" --> "21st"
//"2154" --> "22nd"
//"2259" --> "23rd"
//"1124" --> "12th"
//"2000" --> "20th"

package kata;

public class WhatCenturyIsIt {

	public static String whatCentury(int year) {
	     String result = "";
	     if (year % 100 == 0) {
	    	 result = result + year/100;
	     } else {
	    	 result = result + (year/100 + 1);
	     }
		
	     if (result.endsWith("11") || result.endsWith("12") || result.endsWith("13")) {
	    	 result += "th";
	     } else if (result.endsWith("1")) {
	    	 result += "st";
	     } else if (result.endsWith("2")) {
	    	 result += "nd";
	     } else if (result.endsWith("3")) {
	    	 result += "rd";
	     } else {
	    	 result += "th";
	     }

	     return result;
	}
}
