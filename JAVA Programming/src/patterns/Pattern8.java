package patterns;




public class Pattern8 {

	public static void main(String[] args){
		int n=4;

		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=n; j++)
			{

				if((i==j)||(i+j==4))
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}

			}
			System.out.println();
		}
	}
}

