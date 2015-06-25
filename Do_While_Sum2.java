// Aaron Whittle Do While loop sum example

class Do_While_Sum2 {

    public static void main(String args[]) {

        int i = 0;
        int sum = 0;

        do {
            sum = sum + i;
             ++i;
           
        
        }
        if(sum % 2 == 0)
            continue;
        while (i <= 50);

        System.out.println("The sum of all the odd numbers from 0 to 50 is " + sum);

    }
}

