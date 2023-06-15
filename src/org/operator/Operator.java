package org.operator;
import java.util.Scanner;
public class Operator {
	public static void main(String[] args) {
		Scanner voter = new Scanner(System.in);
	System.out.println("what's your age");
	float person_age = voter.nextFloat();
	if (person_age>=18) {

		System.out.println("Person is Eligiable To Vote");
		}		
	else	{
		System.out.println("Person is Not Eligiable To Vote");
	}
	}
	}
