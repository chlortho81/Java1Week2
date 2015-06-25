//Aaron Whittle Do While loop example

class Do_While_Ex {

    public static void main(String args[]) {

        int i = 0;

        do {
            System.out.println("The value of i is " + i);

            i++;
        }
        while(i <= 5);

        i = 5;

        do {
            System.out.println("The value of i is " + i);

            --i;
        }
        while(i >= 0);

    }
}

            
