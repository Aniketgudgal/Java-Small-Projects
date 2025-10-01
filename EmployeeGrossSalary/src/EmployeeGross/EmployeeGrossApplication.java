package EmployeeGross;
/*
 * Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
1. Calculate the gross salary for each employee (gross = basic + hra + da).
2. Find and display the employee with the maximum salary.
3. Print the details of employees whose salary is greater than the average salary of all employees.

Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.

 */
import java.util.Scanner;
public class EmployeeGrossApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeInfo info = new EmployeeInfo();
		info.setEmployee();
		//info.getGrossSalaryofAll();
		info.getMaxSalaryEmp();
		System.out.println("Do you want to see Employee basic salary avg or with gross total employee, yes or no");
		String ans = sc.next();
		if(ans.equals("yes") || ans.equals("y"))
		{
			info.getGreaterThanAvgSal();
		}
		else
		{
			info.getGreaterThanAvgGrossSal();
		}
	}

}
