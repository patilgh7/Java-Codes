
public class Employee {

	private int id;
	private String name;
	private String salary;
	
	private Address add;
	private Address add123;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

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
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Address getAdd123() {
		return add123;
	}

	public void setAdd123(Address add123) {
		this.add123 = add123;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + ", add123=" + add123
				+ "]";
	}
	
	
	

	
	
	
}
