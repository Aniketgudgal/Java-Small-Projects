package VehicleApp;

/*
Vehicle Fuel Efficiency
Task:
 Create a Vehicle class with fields: model, mileage, and fuelCapacity.
 In the main method:
Create a Vehicle object.
Calculate how far the vehicle can travel (mileage * fuelCapacity) and print the result.
Explanation:
 This reinforces using object fields for calculations.

 */
import java.util.Scanner;
public class VehicleFuelApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total vehicle: ");
		int size = sc.nextInt();
		VehicleInfo[] vi = new VehicleInfo[size];
		
		SetInfoVehicle sv = new SetInfoVehicle();
		sv.setData(vi);
		
		//sv.showAllInfo();
		
		Mileage m = new Mileage();
		System.out.println("Do You want the see mileage of all cars ");
		System.out.println("yes or no");
		String ans = sc.next();
		if(ans.equals("yes"))
		{
			m.getMaleage(vi);
		}
		else
		{
			System.out.println("Enter the search vehicle name");
			sc.nextLine();
			String name = sc.nextLine();
			m.getMaleage(vi,name);
		}
		
		
		
	}

}
