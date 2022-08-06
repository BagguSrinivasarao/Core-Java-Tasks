package task3_oops;

public class Circle extends Shape {
	final public static double pi=3.14;
	public double radius;
	
  public Circle(double radius) {
		this.radius = radius;
	}
public void findArea()
{
	double area = pi*radius*radius;
	System.out.println("Area of the Circle:"+area+" sq mts");
}
public void findPerimeter() {
	double perimeter = 2*pi*radius;
	System.out.println("Perimeter of the circle:"+perimeter+" mts");
}
}
