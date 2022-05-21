package org.poorni.day1;

public class FndIndexPostion {
	public static void main(String[] args) {
		String s = "Poornima";
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='P') {
				System.out.println(i);
			}
		}
	}

}
