package com;
import java.util.Scanner;
//1.W.A.P TO PRINT N NO OF NUMBER SERIES. (BINARY NUMBERS)
//1 2 4 8 16....


public class NumberSeries {

	
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		
		for(int i = 0; i<=n; i++)
		{
			System.out.print((1<<i)+" ");
		}
		
	s.close();	
	}
}
