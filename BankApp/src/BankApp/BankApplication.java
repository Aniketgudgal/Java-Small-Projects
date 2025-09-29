package BankApp;
/*
 10. Bank Account Balance Update
Task:
 Create a BankAccount class with fields: accountHolderName and balance.
 In the main method:
Create a BankAccount object.
Deposit an amount into the account and print the updated balance.
Explanation:
 This introduces updating object fields and performing logical operations.

 */
import java.util.*;
public class BankApplication {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Branch branch = new Branch();
		
		branch.setAccount();
		int op;
		do {
			System.out.println();
		System.out.println("Select the option");
		System.out.println("1. Branch details\t 2. All account holder details\t 3. Deposit amount\t 4. Exit");
		 op = sc.nextInt();
		if(op == 1)
		{
			branch.getBranchDetails();
		}
		else if(op == 2)
		{
			branch.ShowAllAccountDetails();
		}
		else if(op == 3)
		{
			branch.depositAmount();
		}
		else if(op == 4)
		{
			System.out.println("logout");
		}
		else
		{
			System.out.println("Enter the valid input");
		}
		}while(op != 4);
		System.out.println("Thank you visit again !");
	}

}
