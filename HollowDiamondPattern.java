
/*class HollowDiamond
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(i+j==5 || i+j==11)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}           */

class HollowDiamondPattern
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<5; j++)
			{
				System.out.print("  ");
			}
			System.out.print("* ");

			if(i>1)
			{
				for(int j=1; j<=2*i-3; j++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
	    } 

		for(int i=4; i>=1; i--)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print("  ");
			}
			System.out.print("* ");

			if(i>1)
			{
				for(int j=1; j<=2*i-3; j++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}   
	}
}




