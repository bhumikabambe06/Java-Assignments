class Shape{
    int area;
}
class Triangle{
   int base;
   int height;
   Triangle(int base,int height)
   {
      this.base=base;
      this.height=height; 
   } 
   void calculateArea(Triangle t)
   {
       double area=0.5*t.base*t.height;
       System.out.println("area of triangle:" + area);
   }
   
}//class Triangle ends here
class Rectangle{
  int length;
  int breadth;
  void calculateArea(Rectangle p)
  {
   int area=p.length*p.breadth;
   System.out.println("Area of rectangle:" + area) ;
  }  

  
}//class Rectangle ends here
class Circle{
  int radius;
  void calculateArea(Circle x) 
  {
     double area=3.14*x.radius*x.radius;
     System.out.println("Area of circle:" + area);
  } 
   
  
}//class Circle ends here
class Output{
   public static void main(String[] args)
   {
     Triangle t;
     t=new Triangle(2,5);
     t.calculateArea(t);

    Rectangle r;
    r=new Rectangle();
    r.length=5;
    r.breadth=5;
    r.calculateArea(r); 
  
    Circle c;
    c=new Circle();
    c.radius=5;
    c.calculateArea(c);
     
   }
}

