package tt.ss.rr;

import java.lang.reflect.Field;

public class ObjectClass {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		testToString();
		testClass();
	}
	public static void testToString(){
		Employee ee = new Employee("zhangsan", 50000.00, "2018.7.29");
		System.out.println(ee);
	}
	public static void testClass() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Employee harry = new Employee("Harry Hacker", 35000 , "1989.10.1");
		Class<? extends Employee> cl = harry.getClass();
		Field f = cl.getDeclaredField("name");
		f.setAccessible(true);
		Object ob = f.get(harry);
		System.out.println(f);
		System.out.println(ob);
	}

}

class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	private String hireDay;

	public Employee(String name, double salary, String hireDay) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDay = hireDay;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getHireDay() {
		return hireDay;
	}

	public void setHireDay(String hireDay) {
		this.hireDay = hireDay;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Double.compare(salary, o.salary);
	}
}
