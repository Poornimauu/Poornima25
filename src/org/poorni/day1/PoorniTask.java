package org.poorni.day1;

public class PoorniTask {
	public static void main(String[] args) {
		String s = "Poornima";
		String s1 = "poornima";
		String s2 = " Welcome to java";
		String s3 = "Welcome to Selenium Java";
		//TO FIND LENGTH
		int len = s.length();
		System.out.println(len);
		System.out.println("************");
		//TO CHANGE THE Gn STRING TO UPPERCASE
		String up = s.toUpperCase();
		System.out.println(up);
		System.out.println("************");
		//TO CHANGE THE Gn STRING TO LOWERCASE
		String lo = s.toLowerCase();
		System.out.println(lo);
		System.out.println("************");
		//TO COMPARE THE 2 STRINGS WITH CASE SENSITIVE 
		boolean cr = s.equals(s1);
		System.out.println(cr);
		System.out.println("************");
		//TO COMPARE THE 2 STRINGS USING INDEX 
		int in = s.indexOf("o");
		System.out.println(in);
		System.out.println("************");
		//TO COMPARE THE 2 STRINGS USING LAST INDEXOF  
		int in1 = s.lastIndexOf("o");
		System.out.println(in1);
		System.out.println("************");
		//TO GET PARTICULAR CHARACTER FROM THE STRING
		char ch = s.charAt(2);
		System.out.println(ch);
		System.out.println("************");
		//TO COMPARE THE 2 STRNIGS WITHOUT CASE SENSITIVE
		boolean cm = s.equalsIgnoreCase(s1);
		System.out.println(cm);
		System.out.println("************");
		//TO REPLACE THE CHARACTER
		String rep = s2.replace("java","python" );
		System.out.println(rep);
		System.out.println("************");
		//TO CHECK OUR STRING ENDSWITH PARTICULAR VALUE OR NOT
		boolean enswith = s2.endsWith("class");
		System.out.println(enswith);
		System.out.println("************");
		// TO CHECK THE VALUE IS PRESENT OR NOT
		boolean cnta = s2.contains("to");
		System.out.println(cnta);
		System.out.println("************");
		//TO REMMOVE THE UNWANTED SPACE FROM THE STRING
		String tr = s2.trim();
		System.out.println(tr);
		System.out.println("************");
		//TO FIX THE STARTING POSITION OF THE STRING
		String sbstrn = s2.substring(4);
		System.out.println(sbstrn);
		System.out.println("************");
		// TO FIX THE STARRING AND THE ENDING POSITION
		String sbstrn1 = s2.substring(4, 11);
		System.out.println(sbstrn1);
		System.out.println("************");
		//TO COMPARE THE TWO VALUES
		int cmpr = s.compareTo(s1);
		System.out.println(cmpr);
		}

}
