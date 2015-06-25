// Aaron Whittle another For example

class ForSum2 {

    public static void main(String args[]) {

        int i;

        int sum = 0;

        for(i = 0; i <= 50; ++i) {

            if (i % 2 == 0) continue;

            sum = sum + i;

        }
        
        System.out.println("The sum of the odd numbers from 0 to 50 is " + sum);

    }
}

