// Aaron Whittle non-void method example

class Emprec {
    String name;
    double hours;
    double rate;

    double calc_gross_pay() {

        return (hours * rate);

    }// calc_gross_pay

}// Emprec

class Emp_Ex4 {

    public static void main(String args[]) {

        Emprec employee = new Emprec();
        Emprec employee2 = new Emprec();
        Emprec employee3 = new Emprec();
        double employee_gross_pay;

        // Let's assign values to both employee's objects

        employee.name = " Mary Smith ";
        employee.hours = 40;
        employee.rate = 15.00;
        

        employee2.name = " Butch Barkley ";
        employee2.hours = 3;
        employee2.rate = 6.25;

        employee3.name = " Jennifer Whittle ";
        employee3.hours = 35;
        employee3.rate = 22.00;

        // Let's compute the gross salary for Mary

        System.out.print(" The gross salary for " + employee.name );

        employee_gross_pay = employee.calc_gross_pay();

        System.out.print("is " + employee_gross_pay);

        // Let's compute the gross salary for Butch
        
        System.out.print(" The gross salary for " + employee2.name );

        employee_gross_pay = employee2.calc_gross_pay();

        System.out.println("is " + employee_gross_pay);

        // Compute the gross salary for Jennifer

        System.out.print(" The gross salary for " + employee3.name );
        
        employee_gross_pay = employee3.calc_gross_pay();

        System.out.println(" is " + employee_gross_pay);
    }

}



