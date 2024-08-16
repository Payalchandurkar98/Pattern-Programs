/* Java program to print triangle pattern of odd numbers
          1 
          3 2
          6 5 4
          10 9 8 7
          15 14 13 12 11                        */


class TrianglePattern7
{
public static void main(String[] args)
 {
 	int num = 0;
 	for(int i=1; i<=5; i++)
 	{
 		num = num + i;
 	    for(int j=1; j<=i; j++)
 		{
 			System.out.print(num-- +" ");
 		}

    num = num + i;

    System.out.println();
    }
  }
}  


