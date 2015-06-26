// Aaron Whittle one more reference example

class Emprec {
	String name;
	double hours;
	double rate;
}

// This class declares an object of type Emprec

class Emp_Ex11 {

	public static void main(String[] args) {
		
		Emprec employee = new Emprec();

		Emprec empref; // THis is an reference to any object of type Emprec

		double employee_gross_pay;

		// Assign values to employee's variables

		employee.name = " Mary Smith ";
		employee.hours = 40;
		employee.rate = 15.00;

		// Compute the gross salary for employee

		employee_gross_pay = employee.hours * employee.rate;

		// Print the output for this employee

		System.out.print("The gross salary for " + employee.name);
		System.out.println("is" + employee_gross_pay);

		// Let's use the reference
		empref = employee;
		// Print the output using the reference

		System.out.println("The gross pay for " + empref.name);
		System.out.println("when he/she worked " + empref.hours);
		System.out.println("hours at a rate of " + empref.rate);
		System.out.println("dollars per hour is " + employee_gross_pay);

		// Can the reference now change the data and effect employee?

		empref.name = " Sally Jones ";
		empref.hours = 45;
		empref.rate = 12.00;

		// Let's redisplay using employee

		// Compute the gross salary for this employee

		employee_gross_pay = employee.hours * employee.rate;

		// Output the gross salary for Sally, using the reference

		System.out.println("The gross salary for " + empref.name);
		System.out.println("when she worked " + empref.hours);
		System.out.println("hours per week at a rate of " + empref.rate);
		System.out.println("dollars per hour is " + employee_gross_pay);

		empref = new Emprec();

		empref.name = " Fred Turner ";
		empref.hours = 22;
		empref.rate = 10.00;

		// Compute and display gross pay for Ted 

		employee_gross_pay = empref.hours * empref.rate;

		System.out.println("The gross pay for" + empref.name);
		System.out.println("when he worked " + empref.hours);
		System.out.println("hours per week at a rate of " + empref.rate);
		System.out.println("dollars per hour is " + employee_gross_pay); 
	}
}