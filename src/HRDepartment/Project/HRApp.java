package HRDepartment.Project;

public class HRApp {

	public static void main(String args[]) {

		Department dept = new Department();
		dept.setDeptName("Java Development");

		Employee emp1 = new Employee(101, "Ram", 5000.0);
		dept.addEmployee(emp1);

		Employee emp2 = new Employee(102, "Kumar", 7000.0);
		dept.addEmployee(emp2);

		//Employee emp3 = new Employee(103, "Dhivya", 3000.0);
		dept.addEmployee(new Employee(103, "Dhivya", 3000.0));

		System.out.println(dept);
		System.out.println("==================================");
		System.out.println("Get Employee By ID ...");
		System.out.println("==================================");
		System.out.println(dept.getEmployeeById(103));

		System.out.println("==================================");
		System.out.println("Get Employee By ID ...");
		System.out.println("==================================");
		Employee[] empList = dept.getAllEmployee();
		for (Employee emp : empList) {
			if(emp != null) {
			System.out.println("Print Employee " + emp);
			}
		}

		System.out.println("==================================");
		System.out.println("Get Total Salary ...");
		System.out.println("==================================");
		System.out.println(dept.getTotalSalary());

		System.out.println("==================================");
		System.out.println("Get Average Salary ...");
		System.out.println("==================================");
		System.out.println(dept.getAvgSalary());

	}
}
