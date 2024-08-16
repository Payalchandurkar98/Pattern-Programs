


class RhombusOfStars {
    
    public static void main(String[] args) {
        
        int size = 5;

        if (size>0 && size%2 == 1) {
            for (int i=1; i<=size; i++) {
                for (int j=1; j<=size-i; j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=2*i-1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            for (int i=size-1; i>=1; i--) {
                for (int j=1; j<=size-i; j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=2*i-1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid size. Please enter an odd positive integer.");
        }
    }
}