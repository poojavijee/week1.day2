package week1.day2;

public class Calculator {
	
	public int add(int n1,int n2, int n3) {
		System.out.println("first number:"+n1);
		System.out.println("second number:"+n2);
		System.out.println("third number:"+n3);
		int sum=n1+n2+n3;
		return sum;
	}
   public int sub(int n1,int n2) {
	   System.out.println("first number:"+n1);
		System.out.println("second number:"+n2);
		int sub=n1-n2;
		return sub;		
	}
	
   public int div(int m1,int m2) {
	   System.out.println("first number:"+m1);
		System.out.println("second number:"+m2);
		int div=m1/m2;
		return div;		
	
}
   public int mul(int a,int b) {
	   System.out.println("first number:"+a);
		System.out.println("second number:"+b);
		int mul=a*b;
		return mul;
		
		
}

	public static void main(String[] args) {
		System.out.println("calculation");
		Calculator calc = new Calculator();
		int a1,a2,a3,a4;
		System.out.println("");
		System.out.println("1.ADDITION:");
		a1 = calc.add(10, 20, 30);
		System.out.println("addition of 3 number is:"+a1);
		System.out.println("");
		System.out.println("2.SUBTRACTION:");
		a2=calc.sub(30, 20);
		System.out.println("subration of 2 number is:"+a2);
		System.out.println("");
		System.out.println("3.DIVITION:");
		a3=calc.div(40, 2);
		System.out.println("divition of 2 number is:"+a3);
		System.out.println("");
		System.out.println("4.MULTIPLICATION:");
		a4=calc.mul(2, 2);
		System.out.println("multiplication of 2 number is:"+a4);
	}
}

	


