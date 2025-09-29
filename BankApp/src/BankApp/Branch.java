package BankApp;
import java.util.Scanner;
public class Branch {
	private BankAccount ba[]; // array of object of bank account class
	private String branchName;
	private int branchPINCode;
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getBranchPINCode() {
		return branchPINCode;
	}
	public void setBranchPINCode(int branchPINCode) {
		this.branchPINCode = branchPINCode;
	}
	// set data of all account holders
	public void setAccount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total accounts in bank");
		int size = sc.nextInt();
		BankAccount[] account = new BankAccount[size];
		ba = account;
		System.out.println();
		System.out.println("Enter the details of account holders");
		System.out.println();
		sc.nextLine();
		for(int i = 0; i < ba.length; i++)
		{
			System.out.print("Enter the "+(i+1)+" Account holder name: ");
			String name = sc.nextLine();
			System.out.print("Enter the default account balance: ");
			int balance = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the branch name: ");
			String bname = sc.nextLine();
			ba[i] = new BankAccount();
			ba[i].setAccountHolderName(name);
			ba[i].setBalance(balance);
			ba[i].setBranchName(bname);
		}
	}
	// show all data of account holders
	public void ShowAllAccountDetails()
	{
		System.out.println();
		System.out.println("All Account Holders Details");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Account Holder Name\t"+"Balance\t\t"+"Branch");
		for(int i = 0; i < ba.length; i++)
		{
			System.out.println(ba[i].getAccountHolderName()+"\t\t\t"+ba[i].getBalance()+"\t\t"+ba[i].getBranchName());
		}
	}
	// get branch details 
	public void getBranchDetails()
	{
		System.out.println("Welcome to Union Bank of India");
		System.out.println("Branch Pune");
		setBranchPINCode(414111);
		System.out.println("Branch Code: "+getBranchPINCode());
	}
	
	public void depositAmount()
	{
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Account Holder Name\t"+"Balance\t\t"+"Branch");
		for(int i = 0; i < ba.length; i++)
		{
			System.out.println(ba[i].getAccountHolderName()+"\t\t\t"+ba[i].getBalance()+"\t\t"+ba[i].getBranchName());
		}
		*/
		System.out.println();
		System.out.print("Enter the account holder name: ");
		int show = -1;
		String name = sc.nextLine();
		boolean flag = true;
		for(int i = 0 ; i < ba.length; i++)
		{
			if(name.equals(ba[i].getAccountHolderName()))
			{
				System.out.print("Enter the deposit amount: ");
				int deposit = sc.nextInt();
				int newAmount = deposit+ ba[i].getBalance();
				show = i;
				ba[i].setBalance(newAmount);
				flag = true;
			}
			else
			{
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("Amount deposit successful");
			System.out.println("Do you want to show new balance");
			System.out.print("yes or no: ");
			sc.nextLine();
			String ans = sc.nextLine();
			if(ans.equals("yes") || ans.equals("y"))
			{
				if(show != -1)
				{
					System.out.println("new Balance in account is: "+ba[show].getBalance());
					System.out.println("Thank you visit again !");
				}
				else
				{
					System.out.println("wrong input");
				}
			}
			else
			{
			System.out.println("Thank you visit again !");
			}
		}
		else
		{
			System.out.println("Something went wrong");
		}
		
	}
}
