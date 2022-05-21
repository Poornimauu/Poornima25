package org.poorni.day1;

public class EvenIndex {
	public static void main(String[] args) {
		String s = "Poornima";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.println(s.charAt(i));
			}
		}
	}

}
