package Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PermanentEmployee emp1 = new PermanentEmployee("Neetu", "Jayapalan", 23456, 3000);
		System.out.println("Biweekly Pay of Neetu =" + emp1.calculatePay());

		// emp1.setBiweeklySalary(3000,true);
		// System.out.println(emp1.getBiweeklySalary());

		PermanentEmployee emp2 = new PermanentEmployee("John", "Paul", 2123456, 4000);
		System.out.println("Salary of John =" + emp2.calculatePay());

		PermanentEmployee emp3 = new PermanentEmployee("Jack", "Daniel", 776765656, 3500);
		System.out.println("Salary of Jack =" + emp3.calculatePay());

		PermanentEmployee emp4 = new PermanentEmployee("Sam", "Jose", 2122333, 2800);
		System.out.println("Salary of Sam =" + emp4.calculatePay());

		ContractualEmployee emp5 = new ContractualEmployee("Teena", "Jack", 112122132, 2900, 0, 25);
		System.out.println("Pay of Teena = " + emp5.calculatePay());

		ContractualEmployee emp6 = new ContractualEmployee("Tim", "Jo", 232323, 2000, 20, 22);
		System.out.println("Pay of Tim =" + emp6.calculatePay());

		ContractualEmployee emp7 = new ContractualEmployee("Susan", "Mary", 2232323, 2700, 9, 30);
		System.out.println("Pay of Susan =" + emp7.calculatePay());

		ContractualEmployee emp8 = new ContractualEmployee("Maria", "Jiby", 123123, 2000, 9, 33);
		System.out.println("Pay of Maria =" + emp8.calculatePay());

		CommisionBasedEmployee emp9 = new CommisionBasedEmployee("Kevin", "Geo", 1122135, 3800, 10000, 0.15);

		System.out.println("Pay of Kevin = " + emp9.calculatePay());

		CommisionBasedEmployee emp10 = new CommisionBasedEmployee("Peter", "Kim", 2112323, 5000, 13000, 0.15);

		System.out.println("Pay of Peter =" + emp10.calculatePay());

		Employee[] employees = new Employee[10];

		employees[0] = new PermanentEmployee(emp1.firstName, emp1.lastName, emp1.getSinnumber(),
				emp1.getBiweeklySalary());
		employees[1] = new PermanentEmployee(emp2.firstName, emp2.lastName, emp2.getSinnumber(),
				emp2.getBiweeklySalary());

		employees[2] = new PermanentEmployee(emp3.firstName, emp3.lastName, emp3.getSinnumber(),
				emp3.getBiweeklySalary());

		employees[3] = new PermanentEmployee(emp4.firstName, emp4.lastName, emp4.getSinnumber(),
				emp4.getBiweeklySalary());

		employees[4] = new ContractualEmployee(emp5.firstName, emp5.lastName, emp5.getSinnumber(),
				emp5.getBiweeklySalary(), emp5.extraHours, emp5.getPayPerHour());

		employees[5] = new ContractualEmployee(emp6.firstName, emp6.lastName, emp6.getSinnumber(),
				emp6.getBiweeklySalary(), emp6.extraHours, emp6.getPayPerHour());

		employees[6] = new ContractualEmployee(emp7.firstName, emp7.lastName, emp7.getSinnumber(),
				emp7.getBiweeklySalary(), emp7.extraHours, emp7.getPayPerHour());

		employees[7] = new ContractualEmployee(emp8.firstName, emp8.lastName, emp8.getSinnumber(),
				emp8.getBiweeklySalary(), emp8.extraHours, emp8.getPayPerHour());

		employees[8] = new CommisionBasedEmployee(emp9.firstName, emp9.lastName, emp9.getSinnumber(),
				emp9.getBiweeklySalary(), emp9.sales, emp9.PerCommission);

		employees[9] = new CommisionBasedEmployee(emp10.firstName, emp10.lastName, emp10.getSinnumber(),
				emp10.getBiweeklySalary(), emp10.sales, emp10.PerCommission);

		double highestSalary = 3000;

		for (int i = 0; i < employees.length; i++) {

			if (employees[i].calculatePay() > highestSalary) {

				highestSalary = employees[i].calculatePay();

			}
		}

		System.out.println("Highest Salary  = " + highestSalary);

		double lowestSalary = 3000;

		for (int i = 0; i < employees.length; i++) {

			if (lowestSalary > employees[i].calculatePay()) {

				lowestSalary = employees[i].calculatePay();

			}
		}
		System.out.println("Lowest Salary = " + lowestSalary);

	}
}
