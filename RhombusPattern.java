/* Java program to print rhombus pattern of stars 


                                *
                              * * *
                            * * * * *
                          * * * * * * *
                        * * * * * * * * *                                  
                          * * * * * * *
                            * * * * *
                              * * *
                                *                               */



class RhombusPattern 
{
    
    public static void main(String[] args) 
    {
        
        int size = 5;

        //upper half of the rhombus
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

         //lower half of the rhombus
            for (int i=size-1; i>=1; i--) 
            {
                for (int j=1; j<=size-i; j++)    //for spaces
                {
                    System.out.print("  ");
                }
                for (int j=1; j<=2*i-1; j++)      //to print stars
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
     } 
 }
