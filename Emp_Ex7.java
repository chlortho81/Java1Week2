// Aaron Whittle Fun with references

class Emprec {
	String name;
	double hours;
	double rate;
}

// This class declares an object of type Box.

class Emp_Ex7 {

	public static void main(String args[]) {
		
		Emprec employee = new Emprec();

		Emprec empref; // This is a reference to any object of class Emprec

		double employee_gross_pay;

		// Let's assign values to amployee's instance variables

		employee.name = " Mary Smith ";
		employee.hours = 40;
		employee.rate = 15.00;

		// Compute the gross salary for the employee

		employee_gross_pay = employee.hours * employee.rate;

		// Print the output for this employee

		System.out.print("The gross pay for " + employee.name);
		System.out.println(" is " + employee_gross_pay);

		// Now let's use the reference
		empref = employee;
		// Now let's again display the output using reference

		System.out.println("The gross salary for " + empref.name);
		System.out.println(" when he/she worked " + empref.hours);
		System.out.println(" hours and the employee's rate of pay is " + empref.rate);
		System.out.println(" dollars an hour is " + employee_gross_pay);

		// Can the reference now change the data and effect the employee?

		empref.name = " Sally Jones ";
		empref.hours = 45;
		empref.rate = 12.00;

		// Let's redisply using employee

		// Compute the gross salary for Sally

		employee_gross_pay = employee.hours * employee.rate;

		// Print the output for Sally

		System.out.print(" The gross salary for " + employee.name);
		System.out.println("is " + employee_gross_pay);

		// Let's use the reference

		System.out.println("The gross salary for " + empref.name);
		System.out.println(" who worked " + empref.hours);
		System.out.println(" hours at a rate of " + empref.rate);
		System.out.println(" dollars an hour is " + employee_gross_pay);


		empref = new Emprec();

		empref.name = " Fred Turner ";
		empref.hours = 22;
		empref.rate = 10.0;

		// Let's calculate and display Fred's gross salary

		System.out.println("The gross salary for " + empref.name);
		System.out.println(" when he or she has worked " + empref.hours);
		System.out.println(" hours and a rate of " + empref.rate);
		System.out.println(" per hour is " + employee_gross_pay);

		// How about the employee object that has also been changed?

		System.out.println("The gross salary for " + employee.name);
		System.out.println(" when he or she has worked " + employee.hours);
		System.out.println(" hours and a rate of " + employee.rate);
		System.out.println(" per hour is " + employee_gross_pay);
	}
}