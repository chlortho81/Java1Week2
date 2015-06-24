// Aaron Whittle
//
class IncDec {

    public static void main(String args[]) {

        int i = 5;

        int sum = 0;


        System.out.println(" i is " + i + " sum is " + sum);

        sum = sum + i ++;

        System.out.println(" i is " + i + " sum is " + sum);

        //let's return i to 5 and sum to 0

        i = 5;
        sum = 0;
        // no watch the difference
        

        sum = sum + ++i;

        System.out.println(" i is " + i + " sum is " + sum);

        // do you see the difference in the output 
        //
        //
        //  let's once again return i to 5 and sum to 0

        i = 5;
        sum = 0;

        // now watch the difference


        sum = sum + --i;

        System.out.println(" i is " + i + " sum is " + sum);


        // one more time
        //
        i = 5;
        sum = 0;

        sum = sum + i--;

        System.out.println(" i is " + i + " sum is " + sum);


    }
}
        



