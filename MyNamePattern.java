
class MyNamePattern
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(i==1 || j==1 || i==3)
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
		System.out.println();

		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(i==1 || j==1 || i==3 || j==4)
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
		System.out.println();

		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=6; j++)
			{
				if(i==j || i+j==7)
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
		System.out.println();

		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(i==1 || j==1 || i==3 || j==4)
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
		System.out.println();

		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(i==6 || j==1)
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
		System.out.println();


	}
}