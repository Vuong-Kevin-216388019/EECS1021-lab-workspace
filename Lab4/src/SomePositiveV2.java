
public class SomePositiveV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ns = {-2, -7, 4, 5, -1};
		boolean somePos = false;
		for(int i = 0; i < ns.length; i++) {
			/* wrong version wihtout acumulation */
			somePos = ns[i] > 0;
		}
		
		System.out.println("All elements in array are positive: " + somePos);
	}

}
