package Points_v1;

public class Point {
	
	double x; //typically do not initialize variables here
	double y;
	
	/*
	 * Constructors: "methods" for constructing new instances of Point
	 * here is defining Constructors
	 * Rule: Name of constructors must be the same as the class name
	 */
	
	//Version 1: create a new Point using two values for x and y
	Point(double newX, double newY){
		x = newX;
		y = newY;
		// newX = x; don't reassign input parameter 
	}
	
	//Version 2: create a new Point either along x or y axis
	// Assumes that axis can be either x or y
	Point(char axis, double distance){
		if(axis == 'x') {
			x = distance;
			y = 0;
		}
		else {
			x = 0;
			y = distance;
		}
	}
	
	
	
}
