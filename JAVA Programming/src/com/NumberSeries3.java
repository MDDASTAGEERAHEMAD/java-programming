package com;
import java.util.Scanner;
//2.W.A.P TO PRINT N NO OF NUMBER SERIES.
//1 2 4 7 11 16 22 19 ....n


public class NumberSeries3 {
	public static void main(String[] ars){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();

       int sum=1;
		for(int i = 0; i < n; i++)
		{
			sum=sum+i;
			System.out.println(sum);
		}


		s.close();
	}
}
