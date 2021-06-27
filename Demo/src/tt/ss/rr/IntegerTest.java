package tt.ss.rr;

public class IntegerTest {
	public static void main(String[] args) {
		Integer i1 = new Integer(5);
		Integer i2 = new Integer(5);
		System.out.println(i1 == i2);// false
		
		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println(i3 == i4);// false 
		
		Integer i5 = 100;
		Integer i6 = 100;
		System.out.println(i5 == i6);// true
		
		int tri = triple(5);
		System.out.println(tri);
		
		Integer tri1 = triple(new Integer(6));// ×Ô„ÓŞD“Q
		System.out.println(tri1);

	}
	public static int triple(int x){
		x = 3*x;
		return x;
	}
	public static Integer triple(Integer x){
		x = 30*x;
		return x;
	}
}
