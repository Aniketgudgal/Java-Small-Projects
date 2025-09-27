package StudentResult;
import java.util.*;
class PrintResult {
	StudentResultDetails[] s;
	Scanner sc = new Scanner(System.in);
	public void setObj(StudentResultDetails[] s)
	{
		this.s = s;
	}
	void showResult()
	{
		for(int i = 0; i < s.length; i++)
		{
			s[i] = new StudentResultDetails();
			System.out.print("Enter id of "+(i+1)+" student: ");
			int id = sc.nextInt();
			s[i].setId(id);
			
			System.out.print("Enter the student name: ");
			String name = sc.next();
			s[i].setName(name);
			
			System.out.print("Enter the total subject: ");
			int subCout = sc.nextInt();
			String[] sub = new String[subCout];
			int marks[] = new int[subCout];
			for(int j = 0; j < marks.length; j++)
			{
				System.out.printf("\n");
				System.out.print("Enter the subject "+(j+1)+" name : ");
				sub[j] = sc.next();
				System.out.print("Enter subject "+(j+1)+" marks of "+sub[j]+": ");
				marks[j] = sc.nextInt();
			}
			s[i].setSubject(sub);
			s[i].setMarks(marks);
		}
	}
	
	void PassFail()
	{
		System.out.println("-----------------------------------------------------------------");
		for(int i = 0; i < s.length; i++)
		{
			System.out.println("Student name\t"+"ID of Student");
			System.out.println(s[i].getName()+"\t\t"+s[i].getId());
			System.out.println("Sr.\t"+"Subject\t"+"makrs\t\t"+"Grade");
			for(int j = 0; j < s[i].getMarks().length; j++)
			{
				System.out.print((j+1)+"\t"+s[i].getSubject()[j]+"\t\t"+s[i].getMarks()[j]+"\t");
				if(s[i].getMarks()[j] >=40)
				{
					System.out.print("Pass");
				}
				else
				{
					System.out.print("Fail");
				}
				System.out.println();
			}
			System.out.println("--------------------------------------------------------------");
		}
	}

}
