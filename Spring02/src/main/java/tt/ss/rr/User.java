package tt.ss.rr;

import java.util.List;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class User implements BeanNameAware,BeanFactoryAware,ApplicationContextAware {
	private String name;////
	private List<String> list;
	private Set<String> set;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public void setBeanName(String name) {
		System.out.println("1:"+name);
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("2:"+beanFactory);
		
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("3:"+applicationContext);
		
	}
}
