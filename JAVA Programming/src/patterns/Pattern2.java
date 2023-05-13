package patterns;
//2. PATTERN-2
/*
 1 2 3 4
 1 2 3 4
 1 2 3 4
 1 2 3 4
  */

public class Pattern2 {

	public static void main(String []  args){
		int n=4;
		for(int i=1; i<=n; i++)//rows
		{
			for(int j=1; j<=n; j++)//columns
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}
	}
}
