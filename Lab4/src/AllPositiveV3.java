
public class AllPositiveV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ns = {2, 3, -1, 4, 5};
		boolean allPos = true;
		for(int i = 0; i < ns.length && allPos; i++) {
			// no accumulation of result between iterations
			allPos = ns[i] > 0;
		}
		
		System.out.println("All elements in array are positive: " + allPos);
	}

}
