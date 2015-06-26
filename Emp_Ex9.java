// Aaron Whittle another class example for Emp_Ex

class Emprec {
	String name;
	double hours;
	double rate;

	double calc_gross_pay() {
		return (hours * rate);
	}
}

class Emp_Ex9 {

	public static void main(String[] args) {
		
		Emprec employee = new Emprec();
		Emprec employee2 = new Emprec();
		double employee_gross_pay;

		// Assign value to each employees' objects

		employee.name = " Mary Smith ";
		employee.hours = 40;
		employee.rate = 15.00;

		employee2.name = " Butch Barkely ";
		employee2.hours = 3;
		employee2.rate = 6.25;

		// Display the output for employee

		System.out.print("The gross salary for " + employee.name);
		employee_gross_pay = employee.calc_gross_pay();
		System.out.println("is " + employee_gross_pay);

		// Disply the output for employee2

		System.out.print("The gross salary for " + employee2.name);
		employee_gross_pay = employee2.calc_gross_pay();
		System.out.println("is " + employee_gross_pay);
	}
}