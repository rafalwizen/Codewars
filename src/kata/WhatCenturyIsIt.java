// Link to this task:
// https://www.codewars.com/kata/52fb87703c1351ebd200081f

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
