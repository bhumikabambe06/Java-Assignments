class Calculator{
    void add(int a,int b)
    {  int c=a+b;
         System.out.println("int:"+c);
    }
    void add(double a,int b)
    { 
       double c=a+b;
       System.out.println("double:"+c); 
    } 
    void add(int a,double b)
    { 
       double c=a+b;
       System.out.println("double:"+c); 
    } 
    void add(double a,double b)
    { 
       double c=a+b;
       System.out.println("double:"+c); 
    }  
}//class ends here
class testCalculator{
public static void main(String[] args)
{
   Calculator c1;
   c1=new Calculator();
    c1.add(2,5);
    c1.add(2.0,5.0);
    c1.add(2,5.0);
    c1.add(2.0,5.0); 
}
}