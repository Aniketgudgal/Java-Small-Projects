package VehicleApp;

class VehicleInfo {
	private String vehicalName;
	public String getVehicalName() {
		return vehicalName;
	}
	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}
	public String getVehicalCompany() {
		return vehicalCompany;
	}
	public void setVehicalCompany(String vehicalCompany) {
		this.vehicalCompany = vehicalCompany;
	}
	public String getVehicalModel() {
		return vehicalModel;
	}
	public void setVehicalModel(String vehicalModel) {
		this.vehicalModel = vehicalModel;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCurrentFuel() {
		return currentFuel;
	}
	public void setCurrentFuel(int currentFuel) {
		this.currentFuel = currentFuel;
	}
	private String vehicalCompany;
	private String vehicalModel;
	private int mileage;
	private int fuelCapacity;
	private int currentFuel;
	
	public int getcurrentMileage()
	{
		int ml = mileage*currentFuel;
		return ml;
	}
	
	public int getcompanyMileage()
	{
		int ml = mileage*fuelCapacity;
		return ml;
	}
	public void DisplayInfo()
	{
		System.out.println();
		System.out.println("Vehical details");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("vehicalName\t"+"vehicalCompany\t"+"vehicalModel\t"+"mileage(km/l)\t\t"+"fuelCapacity(liters)\t"+"currentFuel(liters)");
		System.out.println(getVehicalName()+"\t\t"+getVehicalCompany()+"\t\t"+getVehicalModel()+"\t\t"+getMileage()+"\t\t\t"+getFuelCapacity()+"\t\t\t"+getCurrentFuel());
	}
	
	public void MileageInfo()
	{
		System.out.println();
		System.out.println("Vehical details");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("vehicalName\t"+"vehicalCompany\t"+"vehicalModel\t"+"mileage(km/l)\t\t"+"fuelCapacity(liters)\t"+"currentFuel(liters)\t"+"Travel Distance accoding to present fuel(km)\t"+
				"Travel Distance accoding to company(km)\t"
				);
		System.out.println(getVehicalName()+"\t\t"+getVehicalCompany()+"\t\t"+getVehicalModel()+"\t\t"+getMileage()+"\t\t\t"+getFuelCapacity()+"\t\t\t"+getCurrentFuel()+"\t\t\t"+getcurrentMileage()
		+"\t\t\t\t\t\t"+ getcompanyMileage()
				);
	}
}
