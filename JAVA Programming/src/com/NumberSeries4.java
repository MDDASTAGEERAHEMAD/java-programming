package com;
import java.util.Scanner;
//2.W.A.P TO PRINT N NO OF NUMBER SERIES.(SQUARES)
//1 4 9 16 25 36 49...


public class NumberSeries4 {
	public static void main(String[] ars){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();


		for(int i = 1; i < n; i++)
		{

			System.out.println(i*i);
		}


		s.close();
	}
}
