
class Pattern2Practice
{
	public static void main(String[] args) {
		
	for(int i = 1; i<=6; i++)     //outer loop/iterations loop
	{
		for(int j=1; j<=i-1; j++)  //loop for stars
		{
			System.out.print("* ");
		}

		for(int j=5; j>=i; j--)    //loop for spaces
		{
			System.out.print("  ");
		}
		System.out.println();
	}
 }
}