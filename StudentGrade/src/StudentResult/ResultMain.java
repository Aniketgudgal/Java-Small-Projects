package StudentResult;
import java.util.*;
public class ResultMain 
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the student count: ");
		int c = sc.nextInt();
		StudentResultDetails[] s = new StudentResultDetails[c];
		PrintResult r = new PrintResult();
		r.setObj(s);
		r.showResult();
		r.PassFail();
	}
}
