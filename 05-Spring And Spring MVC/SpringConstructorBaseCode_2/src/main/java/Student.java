
public class Student {
	
	private String name;
	private String age;
	private String city;
	
	// Constructor Base Injection
	
	public Student(String name, String age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	
	
	
	
}
