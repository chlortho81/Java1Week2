// Aaron Whittle Revew of objects classes *Reference

class Emprec {
	String name;
	double hours;
	double rate;
}

class Emp_Ex10 {

	public static void main(String[] args) {
		
		Emprec employee = new Emprec();

		Emprec empref; // This is a reference to any object of type Emprec

		double employee_gross_pay;

		// Let's assign values to employee's instance variables

		employee.name = " Mary Smith ";
		employee.hours = 40;
		employee.rate = 15.00;

		employee_gross_pay = employee.rate * employee.hours;

		empref = employee;

		System.out.println("The gross salary for " + empref.name);
		System.out.println("who worked for " + empref.hours);
		System.out.println("hours at a rate of " + empref.rate);
		System.out.println("dollars per hour " + employee_gross_pay);

		// Can the reference now change the data and effect employee?

		empref.name = " Sally Jones ";
		empref.hours = 45;
		empref.rate = 12.00;

		// Let's redisplay using employee

		// Compute gross salary

		employee_gross_pay = employee.hours * employee.rate;

		// Now let's use the reference
		// empref = employee;
		// Let's once again display the output using the reference

		System.out.println("The gross salary for " + empref.name);
		System.out.println("who worked for " + empref.hours);
		System.out.println("hours at a rate of " + empref.rate);
		System.out.println("dollars per hour " + employee_gross_pay);
	}
}