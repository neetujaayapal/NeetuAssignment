package Employe;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee[] employees = new Employee[10];
		System.out.println("Biweekly pay of all employees");

		employees[0] = new PermanentEmployee("Neetu", "Jayapalan", 23456, 6000);
		System.out.println(employees[0].calculatePay());

		employees[1] = new PermanentEmployee("John", "Paul", 2123456, 6500);
		System.out.println(employees[1].calculatePay());

		employees[2] = new PermanentEmployee("Jack", "Daniel", 776765656, 5000);
		System.out.println(employees[2].calculatePay());

		employees[3] = new PermanentEmployee("Sam", "Jose", 2122333, 4500);
		System.out.println(employees[3].calculatePay());

		employees[4] = new ContractualEmployee("Teena", "Jack", 112122132, 6000, 45, 32);
		System.out.println(employees[4].calculatePay());

		employees[5] = new ContractualEmployee("Tim", "Jo", 232323, 2000, 40, 32);
		System.out.println(employees[5].calculatePay());

		employees[6] = new ContractualEmployee("Susan", "Mary", 2232323, 2700, 60, 20);
		System.out.println(employees[6].calculatePay());

		employees[7] = new ContractualEmployee("Maria", "Jiby", 123123, 2000, 50, 30);
		System.out.println(employees[7].calculatePay());

		employees[8] = new CommisionBasedEmployee("Kevin", "Geo", 1122135, 3800, 10000, 0.15);
		System.out.println(employees[8].calculatePay());

		employees[9] = new CommisionBasedEmployee("Peter", "Kim", 2112323, 2000, 13000, 0.15);

		System.out.println(employees[9].calculatePay());

		double highestSalary = employees[0].calculatePay();

		for (int i = 0; i < employees.length; i++) {

			if (employees[i].calculatePay() > highestSalary) {

				highestSalary = employees[i].calculatePay();

			}
		}

		System.out.println("Highest Salary  = " + highestSalary);

		double lowestSalary = employees[0].calculatePay();

		for (int i = 0; i < employees.length; i++) {

			if (lowestSalary > employees[i].calculatePay()) {

				lowestSalary = employees[i].calculatePay();

			}
		}
		System.out.println("Lowest Salary = " + lowestSalary);

	}
}
