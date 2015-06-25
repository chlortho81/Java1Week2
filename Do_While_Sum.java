// Aaron Whittle Do While loop sum example

class Do_While_Sum {

    public static void main(String args[]) {

        int i = 0;
        int sum = 0;

        do {
            sum = sum + i;
            ++i;
        }
        while(i <= 5);

        System.out.println("The sum of the numbers from 0 to 5 is " + sum);

    }
}


