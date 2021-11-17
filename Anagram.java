package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "stops";
		String str2 = "potss";
		System.out.println("string1:"+str1);
		System.out.println("string1:"+str2);
		int length1 = str1.length();
		int length2= str2.length();
		if (length1==length2) {
			char[] ch1= new char[length1];
			char[] ch2= new char[length2];		
			for (int i = 0; i < length1; i++) {
				ch1[i]=str1.charAt(i);			
			}
			for (int i = 0; i < length2; i++) {
				ch2[i]=str2.charAt(i);			
			}
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.out.println("sorted Array :");
			System.out.println(ch1);
			System.out.println(ch2);
			for (int i = 0; i < ch2.length; i++) {	
			if (ch1[i]==ch2[i]) {
				System.out.println("It is Anagram");
			}
			else {
				System.out.println("It is not Anagram");
			}
			}
		}
		else {
			System.out.println("Both string length are not equal so it not Anagram");
		}		
		
	}

}