/* 
Aaron Whittle 
This is another Emp Box, methods, class example that also uses reference
*/

class Emprec {
	
	String name;
	double hours;
	double rate;

}

// This class declares an object of type Box

class Emp_Ex5 {

	public static void main(String[] args) {
		
		Emprec employee = new Emprec();

		Emprec empref; // This is a reference to any object of type Emprec

		double employee_gross_pay;

		// Assign values to employees instance variables

		employee.name = " Mary Smith ";
		employee.hours = 40;
		employee.rate = 15.00;

		// Compute gross salary for this employee

		employee_gross_pay = (employee.hours * employee.rate);

		// Print the outputfor this employee

		System.out.print(" The gross salar for " + employee.name);

		System.out.println("is" + employee_gross_pay);

		// Now let's use the reference

		empref = employee;

		// Let's once again display the output using the reference

		System.out.println("The gross pay for " + empref.name );
		System.out.println(" when he/she has worked " + empref.hours);
		System.out.println(" hours and the employee's rate of pay is " + empref.rate);
		System.out.println(" dollars an hor is " + employee_gross_pay);

		//can the reference now change the data and effect employee??

		empref.name = " Sally Jones ";
		empref.hours = 45;
		empref.rate = 12.00;

		// let's redisplay using employee

		// Compute the gross salary for this employee

		employee_gross_pay = employee.hours * employee.rate;

		// Let's output the gross salary for Sally Jones

		System.out.print(" The gross salary for " + employee.name);

		System.out.println(" is " + employee_gross_pay);

		// Now, let's use the reference

		System.out.println(" The gross salary for " + empref.name);
		System.out.println(" when he/she has worked " + empref.hours);
		System.out.println(" hours and the employee's rate of pay is " + empref.rate);
		System.out.println(" dollars an hour is " + employee_gross_pay);
	}
}