class Pattern1Practice
{
	public static void main(String[] args) {
		
	for(int i = 1; i<=5; i++)     //outer loop/iterations loop
	{
		//for(int j=5; j>=i-1; j--)  //loop for spaces
		for(int j=5; j>i; j--)  //loop for spaces
		{
			System.out.print("  ");
		}

		for(int j=1; j<=i; j++)    //loop for stars
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}