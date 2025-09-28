package VehicleApp;

class Mileage {

	VehicleInfo[] v;
	void getMaleage(VehicleInfo[] v)
	{
		for(int i = 0; i < v.length; i++)
		{
			v[i].MileageInfo();
		}
	}
	void getMaleage(VehicleInfo[] v, String name)
	{
		for(int i = 0; i < v.length; i++)
		{
			if(v[i].getVehicalName().equals(name))
			{
				v[i].MileageInfo();
				break;
			}
			else
			{
				System.out.println("The Vehicle is not present in the details");
				break;
			}
		}
	}
}
