
class HollowTriangle3Pattern
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(j==1 || i==j || i+j==8)
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
}