package EmployeeGross;
/*
 * Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.

 */
public class EmployeeGrossApplication {

	public static void main(String[] args) {
		EmployeeInfo info = new EmployeeInfo();
		info.setEmployee();
		//info.getGrossSalaryofAll();
		info.getMaxSalaryEmp();
	}

}
