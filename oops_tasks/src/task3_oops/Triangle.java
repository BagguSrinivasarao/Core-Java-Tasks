package task3_oops;

public class Triangle extends Shape {
	double length;
	double breadth;
	double height;
	
	public Triangle(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public void findArea()
	{
		double area=0.5*breadth*height;
		System.out.println("Area of the Triangle:"+area+" sq mts");
	}
	
	public void findPerimeter() {
		double perimeter = length+breadth+height;
		System.out.println("Perimeter of the Triangle:"+perimeter+" mts");
}
}
