/* Java program to print a triangle

                                *
                              * * *
                            * * * * *
                          * * * * * * *
                        * * * * * * * * *              */

class Triangle 
{
    
    public static void main(String[] args) 
    {
        
        int size = 5;

            for (int i=1; i<=size; i++) 
            {
                for (int j=1; j<=size-i; j++)     //for spaces
                {
                    System.out.print("  ");
                }
                for (int j=1; j<=2*i-1; j++)     //to print stars
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
