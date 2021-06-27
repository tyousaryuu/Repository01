package tt.ss.rr;

public class MethodArgumentsTest {

	public static void main(String[] args) {
		double max = max(1,2,3);
		System.out.println(max);
		System.out.println(Double.MIN_VALUE);

	}
	public static double max(double... values){
		double largest = Double.MIN_VALUE;
		for (double d : values) {
			if (d > largest) {
				largest = d;
			}
		}
		return largest;
	}


}

