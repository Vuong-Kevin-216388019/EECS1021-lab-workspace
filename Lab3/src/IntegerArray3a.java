
public class IntegerArray3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ia = new int[5];
		
		int j = 0;
		for(int i = 7; i <= 19; i += 3 ) {
			ia[j] = i;
			j++;
		}
		
		for(int i = 0; i < ia.length; i ++) {
			System.out.println("Elements of ia at index " + i + "is: " + ia[i]);
		}
	}

}
