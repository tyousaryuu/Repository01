package tt.ss.rr;

public class Cat {
	double weight;
	int age;
	public Cat(double weight, int age) {
		super();
		this.weight = weight;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [weight=" + weight + ", age=" + age + "]";
	}
}
