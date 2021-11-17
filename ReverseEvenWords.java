package week1.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test="I am a software tester";
		System.out.println(test);
		String[] t = test.split(" ");
		System.out.println(Arrays.toString(t));
		String val = "";
		for (int i = 0; i < t.length; i++) {

		    if (i % 2 == 1)
		        val = val + new StringBuilder(t[i]).reverse().toString() + " ";
		    else
		        val = val + t[i] + " ";
		}
		val = val.trim();
		System.out.println(val);
		            }

		 }