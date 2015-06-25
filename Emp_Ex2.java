// Aaron Whittle Employee Example Boxes 2

class Emprec {
    String name;
    double hours;
    double rate;
}

// This class declares an object of type Box

class Emp_Ex2 {

    public static void main(String args[]) {

        Emprec employee = new Emprec();
        Emprec employee2 = new Emprec();
        double employee_gross_pay;

        // Assign values to both employee's objects

        employee.name = " Mary Smith ";
        employee.hours = 40;
        employee.rate = 15.00;


        employee2.name = " Butch barkley ";
        employee2.hours = 3;
        employee2.rate = 6.25;



        // Let's compute the gross salary for Mary

        employee_gross_pay = employee.hours * employee.rate;

        System.out.print("The gross pay for " + employee.name);

        System.out.println(" is " + employee_gross_pay);

        // Let's compute the gross salary for Butch

        employee_gross_pay = employee2.hours * employee2.rate;

        System.out.print("The gross pay for " + employee2.name);
        
        System.out.print(" is " + employee_gross_pay);
        

    }
}

        

