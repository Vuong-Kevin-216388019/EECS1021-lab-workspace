package Points_v2;

public class Point {
	
	double x; //typically do not initialize variables here
	double y;
	
	/*
	 * Constructors: "methods" for constructing new instances of Point
	 * here is defining Constructors
	 * Rule: Name of constructors must be the same as the class name
	 */
	
	//Version 1: create a new Point using two values for x and y
	Point(double x, double y){
		this.x = x;  // "this" keyword refers to the new object created 
		this.y = y;
		// newX = x; don't reassign input parameter 
	}
	
	//Version 2: create a new Point either along x or y axis
	// Assumes that axis can be either x or y
	Point(char axis, double distance){
		if(axis == 'x') {
			this.x = distance;
			this.y = 0;
		}
		else {
			this.x = 0;
			this.y = distance;
		}
	}
	
	/* Accessors: methods for inquiring about the point.
	 * 
	 */
	double getDistanceFromOrigin() {
		double distance = 0.0;
		
		distance = Math.sqrt(this.x * this.x + Math.pow(y, 2));
		
		return distance;
	}
	
	
	String getDescription() {
		String description = "";
		
		description = "(" + this.x + ", " + this.y + ")";
		
		return description;
	}
	
	
	double getDistanceFrom(Point other) {
		double distance = 0.0;
		
		distance = Math.sqrt(
				Math.pow(this.x - other.x, 2) + 
				Math.pow(this.y - other.y, 2));
	
		return distance;
	}
	
	
	
	/*
	 * Mutators: modifying the attribute values of the context object (this)
	 */
	
	void move(char direction, double units) {
		if(direction == 'U') {
			this.y = this.y + units;
		}
		else if(direction == 'D'){
			this.y = this.y - units;
		}
		else if(direction == 'L') {
			this.x = this.x - units;
		}
		else {
			this.x = this.x + units;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
