// Aaron Whittle Now we're looking at constructors

class Emprec {
	String name;
	double hours;
	double rate;

	Emprec() {} // Default consturctor!!

	Emprec(String name, double hours, double rate) {

		this.name = name;
		this.hours = hours;
		this.rate = rate;

		System.out.println(" \t\t\t this is the string double double constructor");
	}

	Emprec(String name, int hours, double rate) {

		this.name = name;
		this.hours = hours;
		this.rate = rate;

		System.out.println(" \t\t\t this is the string int double constructor");
	}

	double calc_gross_pay() {

		return (this.hours * this.rate);
	}

	double calc_fed_tax(double hours, double rate) {

		double yearly_income;
		yearly_income = hours * rate *52;

		if(yearly_income < 30000.00) return (hours * rate * .28);
		else if(yearly_income < 50000.00) return (hours * rate * .32);
		else return (hours * rate * .38);
	}

	double calc_state_tax(double hours, double rate) {

		double state_tax;
		state_tax =  hours * rate * .0561;

		return (state_tax);
	}

}

class Emp_Ex12 {

	public static void main(String[] args) {
		
		Emprec employee = new Emprec("Mary Smith", 40.0, 15.00);
		Emprec employee2 = new Emprec("Butch Barkley", 3, 6.25);
		Emprec X = new Emprec();

		double employee_gross_pay;
		double employee_fed_tax;

		// Let's assign values to both employees' objects

		// The following code will now be replace with a constructor:

		/*
			employee.name = "Mary Smith";
			employee.hours = 40;
			employee.rate = 15.00;

			employee2.name = "Butch Barkley";
			employee2.hours = 3;
			employee2.rate = 6.25;
		*/

		// Let's disploy the output for employee first

		System.out.print("The gross salary for " + employee.name);

		employee_gross_pay = employee.calc_gross_pay();
		employee_fed_tax = employee.calc_fed_tax(employee.hours, employee.rate);

		System.out.println("is " + employee_gross_pay);
		System.out.println(" the federal income tax ss " + employee_fed_tax);
		System.out.println(" the state income tax is " + employee.calc_state_tax(employee.hours, employee.rate));

		// Let's display the output for employee2

		System.out.print("The gross salary for " + employee2.name);

		employee_gross_pay = employee2.calc_gross_pay();
		employee_fed_tax = employee2.calc_fed_tax(employee2.hours, employee2.rate);

		System.out.println("is " + employee_gross_pay);
		System.out.println(" the federal income tax is " + employee_fed_tax);
		System.out.println(" the state income tax is " + employee2.calc_state_tax(employee2.hours, employee2.rate));

		// Let's see if employee2 can be made into a reference

		employee2 = employee;

		/*
			Let's redisplay the data for employee2.
			Remember, if it is now a reference for employee,
			it will display employee's data.
		*/

		// Now let's print the output for employee2
		// Which is now a reference for employee

		System.out.print("The gross pay for " + employee.name);
		employee_gross_pay = employee2.calc_gross_pay();
		System.out.println(" is " + employee_gross_pay);
		employee_fed_tax = employee2.calc_fed_tax(employee2.hours, employee2.rate);
		System.out.println("The federal income tax is " + employee_fed_tax);
		System.out.println("The state income tax is " + employee2.calc_state_tax(employee.hours, employee.rate));



	}
}