package tt.ss.rr;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionTest {

	public static void main(String[] args) {
		String name = "java.util.Date";
		try {
			Class<?> cl = Class.forName(name);
			Class<?> superclass = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0) {
				System.out.println("modifiers:" + modifiers);// public
			}
			Field[] fields = cl.getDeclaredFields();
			for (Field field : fields) {
				System.out.println("fields:" + field);
			}
			Constructor<?>[] constructors = cl.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.println("constructor:" + constructor);
			}
			System.out.println("class:" + name);
			System.out.println("extends:" + superclass);
			System.out.println("\n{\n");
			 printConstructors(cl);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void printConstructors(Class<?> cl) {
		Constructor<?>[] constructors = cl.getDeclaredConstructors();
		for (Constructor<?> c : constructors) {
			String name = c.getName();
			System.out.println(" ");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0) {
				System.out.println(modifiers + " ");
				System.out.println(name + " ");
			}
			Class<?>[] paramTypes = c.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				if (i > 0) {
					System.out.println(paramTypes[i]);
				}
			}
		}
	}

}
