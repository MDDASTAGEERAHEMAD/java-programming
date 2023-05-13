package com;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Calculator");
		int a = s.nextInt();
		char x = s.next().charAt(0);
		int b = s.nextInt();

		switch(x)
		{


		case '+' : System.out.println(a+b);
		break;
		case '-' :System.out.println(a-b);
		break;
		case '*' : System.out.println(a*b);
		break;
		case '/' : 
			if (b== 0)
				System.out.println("Cannot divide by zero");
			else
				System.out.println(a/b);
			break;
		case '%' : System.out.println(a%b);
		break;
		default: System.out.println("Invalid operator");

		} 

		s.close();
	}
}






