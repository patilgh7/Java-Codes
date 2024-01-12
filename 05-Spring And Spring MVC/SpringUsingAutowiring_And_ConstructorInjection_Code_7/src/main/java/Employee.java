
public class Employee {

	private int id;
	private String name;
	private String salary;

	private Address address;


	public Employee(int id, String name, String salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
