package com;
import java.util.Scanner;
//2.W.A.P TO PRINT N NO OF NUMBER SERIES.(SQUARES)
//1 3 6 10 15 21 28 36 45...


public class NumberSeries5 {
	public static void main(String[] ars){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();

int sum=0;
		for(int i = 1; i < n; i++)
		{

			sum=sum+i;
			System.out.print(sum+" ");
		}


		s.close();
	}
}
