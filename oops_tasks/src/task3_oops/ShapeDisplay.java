package task3_oops;

public class ShapeDisplay {
	
	public static void calculateDetails(Shape shape)
	{
		shape.findArea();
		
		shape.findPerimeter();
		
	}
	
public static void main(String[] args) {
	
	calculateDetails(new Circle(1.2));
	
	calculateDetails(new Triangle(3,4,5));
	
	calculateDetails(new Square(8));
}

}
