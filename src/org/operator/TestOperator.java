package org.operator;
public class TestOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = a+b+c;
		System.out.println("Value of d  "  +d);
		if (a>d) {
			System.out.println("a value is greator than d");
		}
		else {
			System.out.println("a value is lesser than d");
		}
		if (b>c && a>b) {
			System.out.println("d value is lesser than c");
		}
		else {
			System.out.println("d value is lesser than b and a");
		}
		if (d>c || c<d) {
			System.out.println("value d is greatest of all value");	
		}
		else {
			System.out.println("value d is not greatest");
		} 
	}
}

