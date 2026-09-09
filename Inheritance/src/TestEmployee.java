class Employee{
	int id;
	String name;
	double salary;
	
	Employee() {
		this.id = 0;
		this.name = "not given";
		this.salary = 0;
	}
	
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	void  display()
	{
		System.out.println("ID:" + this.id);
		System.out.println("Namee:" + this.name);
		System.out.println("Salary:" + this.salary);
	}
}
class Admin extends Employee{
	double allowance;
	Admin() {
		super();
		this.allowance =0;
	}
	Admin(int id,String name,double salary,double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	void display()
	{
		super.display();
		System.out.println("Allowance:" + this.allowance);
	}
		
}
class SalesManager extends Employee{
    double incentive;
    int target;
    SalesManager() {
		super();
		this.incentive = 0;
		this.target = 0;
	}
	
	SalesManager(int id,String name,double salary,double incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	void display()
	{
		super.display();
		System.out.println("Incentive: " + this.incentive);
		System.out.println("Target:" + this.target);
	}
}
class HR extends Employee{
	int commission;
	HR() {
		super();
		this.commission = 0;
	}
	HR(int id,String name,double salary,int commission) {
		super(id,name,salary);
		this.commission = commission;
	}
	void dispay()
	{
		super.display();
		System.out.println("Commission:" + this.commission);
	}	
}
class TestEmployee {
	public static void main(String[] args)
	{
	//Employee e1=new Employee(101,"bhumika",30000);
	//e1.display();
	HR h1=new HR(101,"bhumika",30000,5000);
	h1.dispay();
	Admin a1=new Admin(102,"Gauri",50000,5467);
	a1.display();
	}

}
