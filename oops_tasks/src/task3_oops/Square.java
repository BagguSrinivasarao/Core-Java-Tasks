package task3_oops;

public class Square extends Shape {
	double length;
	
public Square(double length) {
		this.length = length;
	}
	public void findArea()
	{
		double area =length*length;
		System.out.println("Area of the Square:"+area+ " sq mts");
	}
	public void findPerimeter() {
		double perimeter =4*length;
		System.out.println("Perimeter of the Square:"+perimeter+" mts");
	}
}
