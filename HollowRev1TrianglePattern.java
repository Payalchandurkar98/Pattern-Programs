
class HollowRev1TrianglePattern
{
	public static void main(String[] args) 
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==5 || j==1 || i==j)
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
