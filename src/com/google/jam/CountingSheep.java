package com.google.jam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(
	            new InputStreamReader(System.in));

		int testCases = Integer.parseInt(in.readLine());
		
		for(int j=0; j<testCases; j++) {
			long input = Long.parseLong(in.readLine());
			
			if(input == 0) {
				System.out.println("Case #"+(j+1)+": INSOMNIA");
				continue;
			}
			
			long copyValue = input;
			long loopCount = 1;
			Set<Long> count = new HashSet<>();
			boolean insomnia = false;
			
			while (true) {
				String value = String.valueOf(input);
				for (int i=0; i < value.length(); i++) {
					char a = value.charAt(i);
					Long digit = Long.valueOf(a+"");
					count.add(digit);
				}
				if (count.size() == 10) {
					break;
				}
				
				loopCount += 1L;
				if(loopCount == Integer.MAX_VALUE) {
					insomnia = true;
					break;
				}
				input = copyValue*loopCount;
			}
			
			if(insomnia) {
				System.out.println("Case #"+(j+1)+": INSOMNIA");
			}else {
				System.out.println("Case #"+(j+1)+": "+input);
			}
			
		}
		
	}

}
