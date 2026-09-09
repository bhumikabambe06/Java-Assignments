class ElectricityBill{
	static double rate=8.0;
	String cname;
	int unitCovered;
	
	ElectricityBill() {
		this.cname = "something";
		this.unitCovered =0;
	}
	
	ElectricityBill(String cname, int unitCovered) {
		this.cname = cname;
		this.unitCovered = unitCovered;
	}

	static double getRate() {
		return rate;
	}

	static void setRate(double rate) {
		ElectricityBill.rate = rate;
	}

	String getCname() {
		return cname;
	}

	void setCname(String cname) {
		this.cname = cname;
	}

	int getUnitCovered() {
		return unitCovered;
	}

	void setUnitCovered(int unitCovered) {
		this.unitCovered = unitCovered;
	}
	  double calculateBill()
	  {
		  return unitCovered*rate;
		  
	  }
	  void display()
	  {
		  System.out.println("rate:" + this.rate);
		  System.out.println("Name:" + this.cname);
		  System.out.println("unit covered: "+ this.unitCovered);
	  }
}
class TestBill {
	 public static void main(String[] args) {
	 ElectricityBill e1=new  ElectricityBill("bhumika ",20);
	 ElectricityBill e2=new  ElectricityBill("gauri ",30);
	 e1.display();
	 e2.display();
	 ElectricityBill.setRate(7);
	 System.out.println("Updated electricty bill");
	 e1.display();
	 e2.display();
	 
	 }
}
