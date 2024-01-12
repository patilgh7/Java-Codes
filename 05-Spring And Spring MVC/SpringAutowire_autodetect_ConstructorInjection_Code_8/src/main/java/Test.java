import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring.xml");

		Employee employee = (Employee) applicationContext.getBean("e");
		System.out.println(employee);
	}

}
