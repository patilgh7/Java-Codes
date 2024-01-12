import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	
	private int id;
	private String name;
	private String salary;
	
	// @Autowired annotation 
	
	@Autowired
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

	@Required
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
