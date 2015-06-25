// Aaron Whittle Switch example 2 "Seasons By Month"

class Switch_Ex2 {
    public static void main(String args[]) {
        int month;
        String season = ""; //this initializes the string vaiable
        String month_name[]={"","Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};

        for(month = 1;month <=12;++month)
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Spring";
                    System.out.println(month_name[month] +" is in the " + season + ".");
                break;
            case 3:
            case 4:
            case 5:
                season = "Summer";
                    System.out.println(month_name[month] +" is in the " + season + ".");
                break;
            case 6:
            case 7:
            case 8:
                season = "Fall";
                    System.out.println(month_name[month] +" is in the " + season + ".");
                break;
            case 9:
            case 10:
            case 11:
                season = "Winter";
                    System.out.println(month_name[month] +" is in the " + season + ".");
                break;
            default:
                season = "Bogus Month";
        }
    }
}


