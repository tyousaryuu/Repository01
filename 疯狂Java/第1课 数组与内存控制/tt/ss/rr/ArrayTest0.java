package tt.ss.rr;

public class ArrayTest0 {

	public static void main(String[] args) {
		int[] pos = new int[5];
		for (int i = 0; i < pos.length; i++) {
			pos[i] = (i+1)*2;//2 4 6 8 10
		}
		int a = pos[1];
		int b = 20;
		pos[2] = b;
		System.out.println(a);
		Cat[] cats = new Cat[2];
		System.out.println(cats);
		System.out.println(cats.toString());
	}

}
