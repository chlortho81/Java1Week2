// Aaron Whittle If Else control statement

class Switch_Ex {

    public static void main(String args[]) {

        int day_number = 23; // Wednesday_Number

        String day_name ="";
/*        
        if(day_number == 0) day_name="Sunday";
        else if(day_number == 1) day_name="Monday";
        else if(day_number == 2) day_name="Tuesday";
        else if(day_number == 3) day_name="Wednesday";
        else if(day_number == 4) day_name="Thursday";
        else if(day_number == 5) day_name="Friday";
        else if(day_number == 6) day_name="Saturday";
        else day_name = "missing";
*/

        
        // we will now replace them with SWITCH statment

        switch(day_number) {

            case 0: day_name="Sunday";break;
            case 1: day_name="Monday";break;
            case 2: day_name="Tuesday";break;
            case 3: day_name="Wednesday";break;
            case 4: day_name="Thursday";break;
            case 5: day_name="Friday";break;
            case 6: day_name="Saturday";break;
            default: day_name="Undefined";break;        
        }        
        System.out.println("Day number " + day_number + " is a " + day_name);

        }

    
}

            


