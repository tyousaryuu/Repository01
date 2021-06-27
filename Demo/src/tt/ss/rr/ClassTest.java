package tt.ss.rr;

public class ClassTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		try {
			Class<?> forName = Class.forName("java.util.Date");
			String name = forName.getName();
			Object newInstance = forName.newInstance();
			
			System.out.println(name);
			System.out.println(newInstance);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
