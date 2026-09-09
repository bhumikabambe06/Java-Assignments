class Shape{
	double area;
	
	Shape() {
		this.area =0;
	}
	
	Shape(double area) {
		this.area = area;
	}
	double getArea() {
		return area;
	}
	void setArea(double area) {
		this.area = area;
	}	
	void display()
	{
		System.out.println("Area" + this.area);
	}
}
class Circle extends Shape{
	double radius;
	
	Circle() {
		super();
		this.radius = 0;
	}

	Circle(double area,double radius) {
		super(area);
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	void display()
	{
		
		super.display();
		this.area=3.14*radius*radius;
		System.out.println("Area of Circle" + area);
		
	}
	
}
class Triangle extends Shape{
	double base;
	double height;
	
	Triangle() {
		this.base = 0;
		this.height = 0;
	}
	
	Triangle(double base, double height) {
		
		this.base = base;
		this.height = height;
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	void display()
	{
		
		this.area=0.5*base*height;
		System.out.println("Area of traingle:" + this.area);
	}
	
}
class Rectangle extends Shape{
	double length;
	double breadth;
	Rectangle() {
		super();
		this.length = 0;
		this.breadth = 0;
	}
	
	Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	void display()
	{
		this.area=this.length*this.breadth;
		System.out.println("Area of Rectangle:" + this.area);
	}
	
}

class TestShape {
	public static void main(String[] args)
	{
		Circle c1=new Circle(2,5);
		c1.display();
		Triangle t1=new Triangle(2,5);
		t1.display();
		Rectangle r1=new Rectangle(2,5);
		r1.display();
		
	}

}
