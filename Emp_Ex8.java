// Aaron Whittle - can an object that has been instantiated become a reference?

class Emprec {
	String name;
	double hours;
	double rate;

	void calc_gross_pay() {

		System.out.println(" The gross salary is " + (hours * rate));
	}	
}

class Emp_Ex8 {

	public static void main(String[] args) {
		
		Emprec employee = new Emprec();
		Emprec employee2 = new Emprec();
		double employee_gross_pay;

		// Assign values to both employees' objects

		employee.name = " Mary Smith ";
		employee.hours = 40;
		employee.rate = 15.00;

		employee2.name = " Butch Barkley ";
		employee2.hours = 3;
		employee2.rate = 6.35;

		// Display output for employee

		System.out.print("The gross salary for " + employee.name);

		employee.calc_gross_pay();

		// Display output for employee2

		System.out.print("The gross salary for " + employee2.name);

		employee2.calc_gross_pay();

		// Now let's see if employee2 can be made to be a reference

		employee2 = employee;

		/* 
			Let's redisplay the data for employee2.
			Remember, if it is now a reference for employee
			it will display employee's data.
		*/

		System.out.print("The gross salary for " + employee2.name);

		employee2.calc_gross_pay();
	}
}