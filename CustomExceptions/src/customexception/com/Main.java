package customexception.com;

class EmptyNameException extends Exception{

	public EmptyNameException(String message) {
		super(message);
	}
	
}
class UnderageException extends Exception{
	 public UnderageException(String message)
	 {
		 super(message);
	 }
}
class InvalidPercentageException extends Exception{
	  public InvalidPercentageException(String message)
	  {
		  super(message);
	  }
}
class NotFitForAdmissionException extends Exception{
	public  NotFitForAdmissionException(String message)
	{
		super(message);
	}
}
class FeesNotPaidException extends Exception{
	public FeesNotPaidException(String message)
	{
		super(message);
	}
}
class InsufficientFeesException extends Exception{
	public InsufficientFeesException(String message)
	{
		super(message);
	}
}

class  AdmissionFrom{
	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	public AdmissionFrom() {
		this.studentName = "Na";
		this.age = 0;
		this.percentage = 0;
		this.courseFees = 0;
		this.feesPaid = 0;
	}
	public AdmissionFrom(String studentName, int age, double percentage, double courseFees, double feesPaid) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	
	public void validateForm() throws UnderageException, EmptyNameException,
	                             InvalidPercentageException, NotFitForAdmissionException,
	                             FeesNotPaidException, InsufficientFeesException
	{
		if(age<17)
		{
			throw new UnderageException("Age must be 17 or above");
		}
		if(studentName.isEmpty()) {
			throw new EmptyNameException("Name cannot be empty");
		}
		if(percentage<0 || percentage>100)
		{
			throw new InvalidPercentageException("Percenatge should be greater than 0 and less than 100");
			
		}
		if(percentage<35)
		{
			throw new  NotFitForAdmissionException("Not fit for admission");
		}
		if(feesPaid==0)
		{
			throw new FeesNotPaidException("Fees paid is 0");
		}
		if(feesPaid<courseFees*0.30)
		{
			throw new InsufficientFeesException("Atleast 30% of course fees must be paid");
		}
		System.out.println("Admission Succesful");
}
}

public class Main {
     public static void main(String[] args)
     {
    	 AdmissionFrom a=new  AdmissionFrom("bhumi",21,56,78,90);
    	 try {
			a.validateForm();
		} catch (UnderageException e) {		
			e.printStackTrace();
		} catch (EmptyNameException e) {
			e.printStackTrace();
		} catch (InvalidPercentageException e) {
			e.printStackTrace();
		} catch (NotFitForAdmissionException e) {
			e.printStackTrace();
			
		} catch (FeesNotPaidException e) {
			e.printStackTrace();
		} catch (InsufficientFeesException e) {
			e.printStackTrace();
     }
}
}
