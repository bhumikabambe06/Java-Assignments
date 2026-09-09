class Employee{
	String name;
	double bsalary;
    static double bonus=4;
    
    Employee() {
		this.name = "xyz";
		this.bsalary = 0;
	}
	Employee(String name, double bsalary) {
		super();
		this.name = name;
		this.bsalary = bsalary;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
	this.name = name;
	}
	double getBsalary() {
		return bsalary;
	}
	void setBsalary(double bsalary) {
		this.bsalary = bsalary;
	}
	static double getBonus() {
		return bonus;
	}
	static void setBonus(double bonus) {
		Employee.bonus = bonus;
	}
	double totalSal() {
          return  bsalary+(bsalary * bonus/100);
	}
	void display()
	{
		System.out.println("Bonus:" + this.bonus);
		System.out.println("Name: " + this.name);
		System.out.println("Basic salary:" + this.bsalary);
	}
    
    
}
class TestEmployee {
	public static void main(String[] args) {
	Employee e1=new Employee("Bhumika",25000);
	e1.display();
	Employee e2=new Employee("Bhagu",50000);
	e2.display();
    Employee.setBonus(5);
    System.out.println("Updated salary");
    e1.display();
    e2.display();
    System.out.println("Total salary of e1" + e1.totalSal());
    System.out.println("Total salary of e2 "+ e2.totalSal());
	}
}
