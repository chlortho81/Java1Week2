// Aaron Whittle WhileSum example

class WhileSum2 {

    public static void main(String args[]) {

        int i = 0;
        
        int sum = 0;
        
        if(sum % 2 == 2) continue;

        while(i <= 5) {
            sum = sum + i;
            
            ++i;
        }
            System.out.println("The sum of the numbers from 0 to 5 is " + sum);

    }
}


