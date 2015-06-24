// Aaron Whittle operations on bits

class BitEx {

    public static void main(String args[]) {

        int i = 5;

        int result = 0;


        System.out.println(" i is " + i + " result is " + result);

        result = i << 1; //multiplied i by 2
        
        System.out.println(" i is " + i + " result is " + result);

        //let's return i to 5 and result to 0

        i = 5;
        result = 0;


        result = i << 3; //multiplies i by 8

        System.out.println("i is " + i + " result is " + result);



        i = 100;
        result = 0;



        result = i >> 2;// divides i by 4

        System.out.println(" i is " + i + " result is " + result);

        //one more time
        //
        i = 64;
        result = 0;

        // last time!!!! Watch the difference
        //
        //

        System.out.println(" i is " + i + " result is " + result);

    }
}
            





