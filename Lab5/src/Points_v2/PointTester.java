package Points_v2;

public class PointTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create point objects
		
		Point p1 = new Point(3, -4);
		Point p2 = new Point('y', 8);
		Point p3 = new Point('y', 8);
		Point p4 = new Point('x', -5);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1 and p2 store different addresses: " + (p1 != p2));
		System.out.println("p1 and p2 store same address: " + (p1 == p2));
		System.out.println(p3);
		System.out.println(p4);
		
		// Version 1 with variables storing return values of accessor method calls
//		double dist1 = p1.getDistanceFromOrigin();
//		double dist2 = p3.getDistanceFromOrigin();
//		
//		String desc1 = p1.getDescription();
//		String desc2 = p3.getDescription();
//		
//		double dist3 = p1.getDistanceFrom(p3);
//	
//		System.out.println("Description of p1: " + desc1);
//		System.out.println("Description of p3: " + desc2);
//		System.out.println("Distance of p1 from (0, 0): " + dist1);
//		System.out.println("Distance of p3 from (0, 0): " + dist2);
//		System.out.println("Distance from p1 to p3: " + dist3);
//		
//		p1.move('R', 3.2);
//		p3.move('D', 4.7);
//		System.out.println("After moving p1 and p3");
//		
//		dist1 = p1.getDistanceFromOrigin();
//		dist2 = p3.getDistanceFromOrigin();
//		desc1 = p1.getDescription();
//		desc2 = p3.getDescription();
//		dist3 = p1.getDistanceFrom(p3);
//		System.out.println("Description of p1: " + desc1);
//		System.out.println("Description of p3: " + desc2);
//		System.out.println("Distance of p1 from (0, 0): " + dist1);
//		System.out.println("Distance of p3 from (0, 0): " + dist2);
//		System.out.println("Distance from p1 to p3: " + dist3);
		
		// Version 2 print out accessor method call return values directly 
		
	
		System.out.println("Description of p1: " + p1.getDescription());
		System.out.println("Description of p3: " + p3.getDescription());
		System.out.println("Distance of p1 from (0, 0): " + p1.getDistanceFromOrigin());
		System.out.println("Distance of p3 from (0, 0): " + p3.getDistanceFromOrigin());
		System.out.println("Distance from p1 to p3: " + p1.getDistanceFrom(p3));
		
		p1.move('R', 3.2);
		p3.move('D', 4.7);
		System.out.println("After moving p1 and p3");
		
		System.out.println("Description of p1: " + p1.getDescription());
		System.out.println("Description of p3: " + p3.getDescription());
		System.out.println("Distance of p1 from (0, 0): " + p1.getDistanceFromOrigin());
		System.out.println("Distance of p3 from (0, 0): " + p3.getDistanceFromOrigin());
		System.out.println("Distance from p1 to p3: " + p1.getDistanceFrom(p3));
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
