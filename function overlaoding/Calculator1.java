class Calculator1{
      
   void add(int a,int b)
   {
       int c=a+b;
       System.out.println("Addition of two integer:" + c);
   }
   void add(double a,double b)
   {
       double c=a+b;
       System.out.println("Addition of two double values:" + c);
   }  
   void add(int a,double b)
   {
       double c=a+b;
       System.out.println("Addition of one int and one double:" + c);
   }  
   void add(double a,int b)
   {
       double c=a+b;
       System.out.println("Addition of one double and one int:" + c);
   } 
   void sub(int a,int b)
   {
        int c=a-b;
        System.out.println("Subtraction of two int:" +c);
   }   
    void sub(double a,double b)
   {
        double c=a-b;
        System.out.println("Subtraction of two double values:" +c);
   }
   void sub(int a,double b)
   {
        double c=a-b;
        System.out.println("Subtraction of one int and one double:" +c);
   } 
   void sub(double a,int b)
   {
      double c=a-b;
      System.out.println("Subtraction of one double and one int:" + c);
   }  
  void mult(int a,int b)
  {
      int c=a*b;
      System.out.println("Multiplication of two integer: " + c);
  }
  void mult(double a,double b)
  {
      double c=a*b;
      System.out.println("Multiplication of two double values" + c);
  }
   void mult(int  a,double b)
  {
      double c=a*b;
      System.out.println("Multiplication of one int and one double" + c);
  }
   void mult(double  a,int b)
  {
      double c=a*b;
      System.out.println("Multiplication of one double and one int " + c);
  }
  void div(int a,int b)
  {
    int c=a/b;
    System.out.println("Division of two integers:" + c);
  }
 
  void div(double a,double b)
  {
    double c=a/b;
    System.out.println("Division of double:" + c);
  }
  void div(int a,double b)
  {
    double c=a/b;
    System.out.println("Division of one int and one double:" + c);
  } 
  void div(double a,int b)
  {
    double c=a/b;
    System.out.println("Division of one double and one int:" + c);
  } 


}//class Calculator ends here
class testCalc{
public static void main(String[] args)
{
     Calculator1 c1;
     c1=new Calculator1();
     c1.add(5,2);
     c1.add(4.2,1.2); 
     c1.add(2,5.3);
     c1.add(2.5,2);
     c1.sub(3,2);
     c1.sub(4.5,2.5);
     c1.sub(5,2.5);
     c1.sub(2.5,1);
     c1.mult(2,5);
     c1.mult(2.0,5.0);
     c1.mult(2,5.0);
     c1.mult(2.0,5);
     c1.div(4,2);
     c1.div(10.0,5.2);
     c1.div(4,2.0);
     c1.div(4.0,2);
    
 


}
}