package task5_oops;

public class Box {
	
	double length;
	
	double breadth;
	
	double height;
	
	public Box(double length, double breadth, double height) {
		
		super();
		
		this.length = length;
		
		this.breadth = breadth;
		
		this.height = height;
		
	}
	
	public void findArea()
	
	{
		
		double area=length*breadth;
		
		System.out.println("Area of the Box:"+area+" Sq mts");
	}
	
	public void findVolume()
	
	{
		double volume=length*breadth*height;
		
		System.out.println("The volume of the Box:"+volume+ " cube mts");
	}

}
