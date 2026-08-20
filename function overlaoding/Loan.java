class Student{
   int rollNo;
   String name;
   double percentage;


}//class Student ends here
class Employee{
   int id;
   String name;
   double annualSalary;

}//class Employee ends here
class Bank{
    void approveLoan(Student s)
    {
       if(s.percentage>80)
            System.out.println("Loan Ammount:Rs 200,000");
       else if(s.percentage>=60)
            System.out.println("Loan Ammount :Rs 6,00,000");
       else if(s.percentage>=40)
             System.out.println("Loan Ammount :Rs 5,00,000");
       else
           System.out.println("loan not approved");
    } 

   void approveLoan(Employee e)
   {
        if(e.annualSalary>1200000)
            System.out.println("Loan Ammount: Rs 7,00,000");
        else if(e.annualSalary>=1000000)
            System.out.println("Loan Ammount: Rs 6,00,000");
        else if(e.annualSalary>=600000)
           System.out.println("Loan Amount: Rs 500000");
       else if(e.annualSalary>=400000)
          System.out.println("Loan Ammount: Rs 4,00,000");
       else
           System.out.println("Loan not approveed");

   }


}//class Bank ends here
class testStudent{
public static void main(String[] args)
{
    Student s;
     s=new Student();
    s.percentage=50.9;
  
     Employee e;
     e=new Employee();
     e.annualSalary=500000;
      
    Bank b;
    b=new Bank();
    b.approveLoan(s);
    b.approveLoan(e);

    
}
}
