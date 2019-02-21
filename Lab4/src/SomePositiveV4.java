
public class SomePositiveV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ns = {-2, -7, 4, 5, -1};
		boolean somePos = false;
		// early exit when possible
		for(int i = 0; i < ns.length && !somePos; i++) {
			//no accumulation
			// as soon as allPos becomes true, the stay condition becomes false and exits
			somePos = ns[i] > 0;
		}
		
		System.out.println("some (at least one) elements in array are positive: " + somePos);
	}

}
