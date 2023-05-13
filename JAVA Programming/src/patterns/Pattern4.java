package patterns;
//4. PATTERN-4
/*
1 2 3 4 
2 3 4 5 
3 4 5 6 
4 5 6 7 
*/
public class Pattern4 {

	public static void main(String[] args){
		int n=4;

		for(int i=0; i<n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(j+i+" ");
		
			}
			System.out.println();
		}
	}
}


