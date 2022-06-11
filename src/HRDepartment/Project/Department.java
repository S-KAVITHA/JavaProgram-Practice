package HRDepartment.Project;

public class Department {

	private String deptName;
	private int lastAddedEmp = -1;
	private Employee[] emplist = new Employee[10];

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void addEmployee(Employee employee) {
		System.out.println("Constructor :==> " + employee);
		/*
		 * for (int i = 0; i < maxEmp; i++) { System.out.println("Entering FOR..."); if
		 * (this.emplist[i] == null) { System.out.println("Entering IF...");
		 * this.emplist[i] = employee; System.out.println("Entering..." +
		 * this.emplist[i]); break; } }
		 */

		if (lastAddedEmp < this.emplist.length) {
			lastAddedEmp++;
			emplist[lastAddedEmp] = employee;
		}

	}

	public Employee[] getAllEmployee() {
		return this.emplist;
	}

	public int getEmployeeCount() {
		// int empCount = this.emplist.length;
		int empCount = lastAddedEmp + 1;
		return empCount;
	}

	public Employee getEmployeeById(int empId) throws NullPointerException {

		// Employee returnEmp = null;
		try {
			for (Employee emp : this.emplist) {
				System.out.println("Enter here");
				if (emp != null && emp.getEmpId() == empId) {
					System.out.println("Get By Id Dept class :==>" + emp);
					return emp;

				}
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return null;
	}

	public double getTotalSalary() {

		double totSalary = 0.0;
		for (Employee emp : this.emplist) {
			if (emp != null) {
				System.out.println("Enter here");
				totSalary += emp.getSalary();
			}
		}

		return totSalary;
	}

	public double getAvgSalary() {

		int totalCnt = lastAddedEmp + 1;
		/*
		 * try { for (Employee emp : this.emplist) { if (emp.getSalary() > 0) { totalCnt
		 * += 1; } } } catch (NullPointerException e) { System.out.println(e); }
		 */
		if (lastAddedEmp > -1) {
			System.out.println(totalCnt);
			double totalSalary = getTotalSalary();
			return (totalSalary / totalCnt);
		}
		return 0.0;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + "]";
	}

}
