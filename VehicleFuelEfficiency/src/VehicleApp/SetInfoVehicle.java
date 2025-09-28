package VehicleApp;
import java.util.Scanner;
class SetInfoVehicle {
	
	VehicleInfo[] v;
	void setData(VehicleInfo[] v)
	{
		this.v = v;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < v.length; i++)
		{
			System.out.print("Enter the "+(i+1)+" vehical name: ");
			String name = sc.nextLine();
			System.out.print("Enter the vehical company name: ");
			String vname = sc.nextLine();
			System.out.print("Enter the model name: ");
			String model = sc.nextLine();
			System.out.print("Enter the company mileage: ");
			int mileage = sc.nextInt();
			System.out.print("Enter the fuel capacity: ");
			int capacity = sc.nextInt();
			System.out.print("Enter the current fuel in vehicle: ");
			int currentFuel = sc.nextInt();
			
			sc.nextLine();
		
			v[i] = new VehicleInfo();
			v[i].setVehicalName(name);
			v[i].setVehicalCompany(vname);
			v[i].setVehicalModel(model);
			v[i].setMileage(mileage);
			v[i].setFuelCapacity(capacity);
			v[i].setCurrentFuel(currentFuel);
		}
	}
	void showAllInfo()
	{
		System.out.println("Vehical details");
		for(int i = 0; i < v.length; i++)
		{
			System.out.println();
			System.out.println("Vehical "+(i+1) +" details");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("vehicalName\t"+"vehicalCompany\t"+"vehicalModel\t"+"mileage(km/l)\t\t"+"fuelCapacity(liters)\t"+"currentFuel(liters)");
			System.out.println(v[i].getVehicalName()+"\t\t"+v[i].getVehicalCompany()+"\t\t"+v[i].getVehicalModel()+"\t\t"+v[i].getMileage()+"\t\t\t"+v[i].getFuelCapacity()+"\t\t\t"+v[i].getCurrentFuel());
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}

}
