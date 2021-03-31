package tt.ss.rr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("tt/ss/rr/applicationContext.xml");
		User user = (User) ctx.getBean("user");
		System.out.println(user.getName());
	}

}
