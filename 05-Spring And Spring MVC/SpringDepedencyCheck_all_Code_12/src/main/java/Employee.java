import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
	
	private int id;
	private String name;
	private String salary;
	
	// @Autowired annotation and change in Spring.xml depedency-check="all"
	

	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		
		System.out.println("Setting Name");
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
	
	

}
