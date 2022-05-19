package org.poorni.day1;

public class PoorniTask {
	public static void main(String[] args) {
	//TO FIND LENGTH
		String s = "Poornima";
		String s1 = "poornima";
		int len = s.length();
		System.out.println(len);
	//TO CHANGE THE Gn STRING TO UPPERCASE
		String up = s.toUpperCase();
		System.out.println(up);
	//TO CHANGE THE Gn STRING TO LOWERCASE
		String lo = s.toLowerCase();
		System.out.println(lo);
	//TO COMPARE THE 2 STRINGS WITH CASE SENSITIVE 
		boolean cr = s.equals(s1);
		System.out.println(cr);
	//TO COMPARE THE 2 STRINGS USING INDEX 
		int in = s.indexOf("o");
		System.out.println(in);
	//TO COMPARE THE 2 STRINGS USING LAST INDEXOF  
		int in1 = s.lastIndexOf("o");
		System.out.println(in1);
	//TO GET PARTICULAR CHARACTER FROM THE STRING
		char ch = s.charAt(2);
		System.out.println(ch);
	//TO COMPARE THE 2 STRNIGS WITHOUT CASE SENSITIVE
		boolean cm = s.equalsIgnoreCase(s1);
		System.out.println(cm);
	//TO REPLACE THE CHARACTER
		                                                                                             
	
	
		
		
	}

}
