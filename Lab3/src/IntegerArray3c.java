
public class IntegerArray3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ia = new int[5];
		
		for(int i = 1; i <= 5; i ++) {
			ia[i -1] = 7 + (i - 1) * 3;
		}
		
		for(int i = 0; i < ia.length; i ++) {
			System.out.println("Elements of ia at index " + i + "is: " + ia[i]);
		}
	}

}
