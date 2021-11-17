package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test ="$$ Welcome to 2nd class of Automation $$";
		int letter=0,space=0,num=0,specialchar=0;
		for (int i = 0; i < test.length(); i++) {
			char charAt = test.charAt(i);
		}
		for (int i = 0; i <test.length(); i++) {
			if (Character.isLetter(test.charAt(i))) {
				letter++;
			}
			else if (Character.isSpaceChar(test.charAt(i))) {
				space++;
			}			
			else if (Character.isDigit(test.charAt(i))) {
				num++;
			}
			else {
				specialchar++;
			}
		//}
		}
		System.out.println("Letter="+letter);
		System.out.println("Space="+space);
		System.out.println("Number Digit="+num);
		System.out.println("Special Character="+specialchar);
	}

}