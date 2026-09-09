class Vehicle{
	int vehicleNumber;
	int model;
	String companyName;
	int noOfWheels;
	double price;
	Vehicle() {
		this.vehicleNumber = 0;
		this.model = 0;
		this.companyName = "not given";
		this.noOfWheels = 0;
		this.price =0;
	}
	Vehicle(int vehicleNumber, int model, String companyName, int noOfWheels, double price) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}
	int getVehicleNumber() {
		return vehicleNumber;
	}
	void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	int getModel() {
		return model;
	}
	void setModel(int model) {
		this.model = model;
	}
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	int getNoOfWheels() {
		return noOfWheels;
	}
	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void display()
	{
		System.out.println("Vehicle Number:" + this.vehicleNumber);
		System.out.println("Model:" + this.model);
		System.out.println("Company Name: "+this.companyName);
		System.out.println("No of Wheels:"+ this.noOfWheels);
		System.out.println("Price:" + this.price);
	}
	
}
class Bike extends Vehicle{
	int noOfStand;
	int noOfHelmets;
	String bikeCategory;
	Bike() {
		super();
		this.noOfStand = 0;
		this.noOfHelmets =0;
		this.bikeCategory = "not given";
	}
	Bike(int vehicleNumber,int model,String companyName,int noOfWheels,double price,int noOfStand, int noOfHelmets, String bikeCategory) {
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.noOfStand = noOfStand;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
	}
	int getNoOfStand() {
		return noOfStand;
	}
	void setNoOfStand(int noOfStand) {
		this.noOfStand = noOfStand;
	}
	int getNoOfHelmets() {
		return noOfHelmets;
	}
	void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}
	String getBikeCategory() {
		return bikeCategory;
	}
	void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}
	void display()
	{
		super.display();
		System.out.println("No of stand:"+this.noOfStand);
		System.out.println("No of Helments:"+this.noOfHelmets);
		System.out.println("Bike Category:"+this.bikeCategory);
	}
	
}
class Car extends Vehicle{
	boolean hasPowerSteering;
	boolean driveMode;
	boolean parkingAssistSensors;
	Car() {
		super();
		this.hasPowerSteering = false;
		this.driveMode =false;
		this.parkingAssistSensors = false;
	}
	Car(boolean hasPowerSteering, boolean driveMode, boolean parkingAssistSensors) {
		super();
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistSensors = parkingAssistSensors;
	}
	boolean isHasPowerSteering() {
		return hasPowerSteering;
	}
	void setHasPowerSteering(boolean hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}
	boolean isDriveMode() {
		return driveMode;
	}
	void setDriveMode(boolean driveMode) {
		this.driveMode = driveMode;
	}
	boolean isParkingAssistSensors() {
		return parkingAssistSensors;
	}
	void setParkingAssistSensors(boolean parkingAssistSensors) {
		this.parkingAssistSensors = parkingAssistSensors;
	}
	void display()
	{
		super.display();
		System.out.println("Has Power steering:" + this.hasPowerSteering);
		System.out.println("drive mode:"+ this.driveMode);
		System.out.println("Parking Assistance:"+ this.parkingAssistSensors);
	}
	
}
class Bus extends Vehicle{
	int passengerCapacity;
	int standingCapacity;
	Bus() {
		super();
		this.passengerCapacity =0;
		this.standingCapacity = 0;
	}
	Bus(int passengerCapacity, int standingCapacity) {
		super();
		this.passengerCapacity = passengerCapacity;
		this.standingCapacity = standingCapacity;
	}
	int getPassengerCapacity() {
		return passengerCapacity;
	}
	void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	int getStandingCapacity() {
		return standingCapacity;
	}
	void setStandingCapacity(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}
	void display()
	{
		super.display();
		System.out.println("Passenger Capcity:" + this.passengerCapacity);
		System.out.println("Standing Capcity:" + this.standingCapacity);
	}
	
}
class TestVehicle {
	public static void main(String[] args)
	{
		Vehicle v1=new Vehicle(101,1,"tata",2,75000);
		v1.display();
		Bike b1=new Bike(101,1,"tata",2,75000,2,1,"two wheeler");
		b1.display();
		Car c1=new Car(true,false,true);
		c1.display();
	}
	

}
