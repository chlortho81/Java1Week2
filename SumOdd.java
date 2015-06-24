//Aaron Whittle SumOdd

class SumOdd {

    public static void main(String args[]) {

        int n;
        int sumeven = 0;
        int sumodd = 0;

        boolean odd;

        for (n = 0;n < 50; ++n) {
            
            odd = ( n % 2 ==1) ? true: false;

            if (odd) sumodd += n;

            if (!odd) sumeven += n;

        }
    System.out.println("The sum of the odd numbers is " + sumodd);

    System.out.println("The sum of the even numbers from 0 to 50 is " + sumeven);

    System.out.println("the sum of the even numbers is greater ");
    System.out.println("than the sum of the oddnumbers is " + (sumeven > sumodd));
    System.out.println();

    }
}








