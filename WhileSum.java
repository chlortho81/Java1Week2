// Aaron Whittle WhileSum example

class WhileSum {

    public static void main(String args[]) {

        int i = 0;
        
        int sum = 0;

        while(i <= 5) {
            sum = sum + i;
            ++i;
        }
            System.out.println("The sum of the numbers from 0 to 5 is " + sum);

    }
}


