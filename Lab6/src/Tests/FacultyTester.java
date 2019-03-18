package Tests;

import Model.Faculty;

public class FacultyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Faculty f1 = new Faculty("Jackie", "LAS2043", 70310);
		Faculty f2 = new Faculty("Jonathan", "LAS2045", 70209);
		System.out.println("f1 and f2 store same adresses: " + (f1 == f2));
		System.out.println(f1.getDescription());
		System.out.println(f2.getDescription());
		
		Faculty f3 = new Faculty("Jackie", "LAS2043", 70310);
		
		System.out.println("f1 and f3 are the same objects: " + (f1 == f3));
		
		System.out.println("f1 and f3 have same adresses: " + f1.getDescription().equals(f3.getDescription()));
		
		
		
		
		Faculty f4 = f1; //aliasing, when an object can have 2 different values but are under the same object.
		
		System.out.println("f1 and f3 are the same objects: " + (f1 == f4));
		
		System.out.println("f1 and f3 have same adresses: " + f1.getDescription().equals(f4.getDescription()));
		
		f1.setName("Heeyon");
		System.out.println("f1");
		System.out.println(f1.getDescription());
		System.out.println("f4");
		System.out.println(f4.getDescription());
		
		
	}

}
