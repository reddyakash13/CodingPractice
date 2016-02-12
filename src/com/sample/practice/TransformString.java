package com.sample.practice;

import java.util.HashMap;
import java.util.Map;

public class TransformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution("ACACACA"));
	}

	public static String solution(String S){
	
		Map<Integer, String> rules = new HashMap<>();
		rules.put(1, "AA");
		rules.put(2, "AA");
		rules.put(3, "CC");
		rules.put(4, "CC");
		rules.put(5, "A");
		rules.put(6, "C");
		
		StringBuffer s = new StringBuffer(S);
		
		for(int i=0;i<=s.length()-2;i++){
			String focus = s.substring(i, i+2);
			String sub = "";
			if(focus.equals("AB") || focus.equals("BA")){
				sub = "AA";
			}else if(focus.equals("CB") || focus.equals("BC")){
				sub = "CC";
			}else if(focus.equals("AA")){
				sub = "A";
			}else if(focus.equals("CC")){
				sub = "C";
			}
			if(sub.isEmpty())
				continue;
			else{
				s.replace(i, i+2, sub);
				i = i - 1;
			}
			
			
		}
		return s.toString();
	}
	
}
