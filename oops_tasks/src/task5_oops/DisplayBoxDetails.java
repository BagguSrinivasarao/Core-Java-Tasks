package task5_oops;

public class DisplayBoxDetails {
	public static void main(String[] args) {
		Box3D box3d = new Box3D(3.1,3.1,5);
	    Box box=new Box3D(1.5,1.5,3.0);
	    box.findArea();
	    box.findVolume();
	    box3d.findArea();
	    box3d.findVolume();
	}

}
