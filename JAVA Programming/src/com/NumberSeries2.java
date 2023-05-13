package com;
import java.util.Scanner;
//2.W.A.P TO PRINT N NO OF NUMBER SERIES.
//1 2 9 28 65....n

public class NumberSeries2 {
	public static void main(String[] ars){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();


		for(int i = 0; i < n; i++)
		{
			System.out.print((i*i*i)+1+" ");
		}
		
		
		s.close();
	}
	
}
