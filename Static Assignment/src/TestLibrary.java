class LibraryUser{
	String username;
	int noOfDays;
	static double fine=200;
	
	LibraryUser() {
		this.username ="not given";
		this.noOfDays = 0;
	}
	
	LibraryUser(String username, int noOfDays) {
		super();
		this.username = username;
		this.noOfDays = noOfDays;
	}

	String getUsername() {
		return username;
	}

	void setUsername(String username) {
		this.username = username;
	}

	int getNoOfDays() {
		return noOfDays;
	}

	void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	static double getFine() {
		return fine;
	}

	static void setFine(double fine) {
		LibraryUser.fine = fine;
	}
	double calFine()
	{
		return noOfDays*fine;
	}
	void display()
	{
		System.out.println("Name:"+this.username);
		System.out.println("No of days:" + this.noOfDays);
		System.out.println("Fine:" + fine);
		
	}
	
	
	
}
class TestLibrary {
       public static void main(String[] args)
       {
    	   LibraryUser l1=new LibraryUser("bhumika",25);
    	   l1.display();
    	   System.out.println("total fine amount:" +l1.calFine());
    	   LibraryUser l2=new LibraryUser("aaru",20);
    	   l2.display();
    	   System.out.println("Total fine amount:" + l2.calFine());
       }
}
