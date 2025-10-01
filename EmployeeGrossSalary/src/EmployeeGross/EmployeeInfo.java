package EmployeeGross;
import java.util.Scanner;
public class EmployeeInfo {

	Employee[] emp;
	public void setEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total Employees: ");
		int size = sc.nextInt();
		// set array size from user
		emp = new Employee[size];
		// insert data in each object of array
		for(int i = 0; i < emp.length; i++)
		{
			System.out.print("Enter the "+(i+1) +" Employee Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Name of "+(i+1)+" Employee: ");
			String name = sc.nextLine();
			System.out.print("Enter the salary of "+(i+1)+" Employee: ");
			int salary = sc.nextInt();
			System.out.print("Enter the HRA of "+(i+1)+" Employee: ");
			int hra = sc.nextInt();
			System.out.print("Enter the DA of "+(i+1)+" Employee: ");
			int da = sc.nextInt();
			
			// store data in each object
			emp[i] = new Employee();
			emp[i].setEmpId(id);
			emp[i].setName(name);
			emp[i].setBasicSalary(salary);
			emp[i].setHra(hra);
			emp[i].setDa(da);
		}
	}
	// show all employee gross salary
	public void getGrossSalaryofAll()
	{
		System.out.println();
		System.out.println("Gross Salary Details of Employees");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.printf("%-5s %-15s %-12s %-10s %-10s %-15s%n",
		        "ID", "Name", "Salary", "HRA", "DA", "Gross Salary");
		for (int i = 0; i < emp.length; i++) {
		    int gross = emp[i].getBasicSalary() + emp[i].getHra() + emp[i].getDa();
		    System.out.printf("%-5d %-15s %-12d %-10d %-10d %-15d%n",
		            emp[i].getEmpId(),
		            emp[i].getName(),
		            emp[i].getBasicSalary(),
		            emp[i].getHra(),
		            emp[i].getDa(),
		            gross);
		}
		
	}
	
	public void getMaxSalaryEmp()
	{
		Scanner sc = new Scanner(System.in);
		// search employee with basic salary or including the salary + hra + da
		System.out.print("You want to see basic max salary or gross max salary, yes or no: ");
		String cond = sc.next();
		if(cond.equals("yes") || cond.equals("y"))
		{
		int max = emp[0].getBasicSalary();
		Employee maxEmp = emp[0];
		for(int i = 0; i < emp.length; i++)
		{
			if(emp[i].getBasicSalary() > max)
			{
				max = emp[i].getBasicSalary();
				maxEmp = emp[i];
			}
		}
		System.out.println();
		System.out.println("The Employee name is: "+maxEmp.getName()+" and maximum salary of employee is: "+ max);
		System.out.println();
		}
		else
		{
			// get the gross max salary of employee
			Employee maxEmp = emp[0];
			int max = maxEmp.getBasicSalary() + maxEmp.getDa() + maxEmp.getHra();
			for(int i = 0; i < emp.length; i++)
			{
				
				if((emp[i].getBasicSalary() + emp[i].getDa() + emp[i].getHra() ) > max)
				{
					max = emp[i].getBasicSalary() + emp[i].getDa() + emp[i].getHra();
					maxEmp = emp[i];
				}
			}
			System.out.println();
			System.out.println("The Employee name is: "+maxEmp.getName()+" and maximum salary of employee is: "+ max);
			System.out.println();
		}
	}
	// only basic salary
	public int getAvgSalary()
	{
		int salSum = 0;
		for(int i = 0; i < emp.length; i++)
		{
			salSum += emp[i].getBasicSalary();
		}
		return (salSum/emp.length);
	}
	// get average salary with including hra and da
	public int getAvgSalaryWithGross()
	{
		int salSum = 0;
		for(int i = 0; i < emp.length; i++)
		{
			salSum += emp[i].getBasicSalary()+emp[i].getHra()+emp[i].getDa();
		}
		return (salSum/emp.length);
	}
	public void getGreaterThanAvgSal()
	{
		//salary is greater than the average salary of all employees
		for(int i = 0; i < emp.length; i++)
		{
			if(emp[i].getBasicSalary() >= getAvgSalary())
			{
				System.out.println(emp[i].getName()+"\t" +emp[i].getBasicSalary());
			}
		}
	}
	public void getGreaterThanAvgGrossSal()
	{
		//salary is greater than the average salary of all employee with hra and da
		for(int i = 0; i < emp.length; i++)
		{
			if(emp[i].getBasicSalary() >= getAvgSalaryWithGross())
			{
				System.out.println(emp[i].getName()+"\t" +emp[i].getBasicSalary());
			}
		}
	}
}
