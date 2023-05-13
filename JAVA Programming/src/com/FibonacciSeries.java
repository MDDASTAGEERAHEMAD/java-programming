package com;
import java.util.Scanner;
//2.W.A.P TO PRINT N NO OF NUMBER SERIES.(FIBONACCI SERIES)
//1 1 2 3 5 8 13.....n


public class FibonacciSeries {
	public static void main(String[] ars){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
int a=1,b=1,c=0;

		for(int i = 0; i < n; i++)
		{

           c=a+b;
			System.out.print(a+" ");
			a=b; 
			b=c;
		}


		s.close();
	}
}
