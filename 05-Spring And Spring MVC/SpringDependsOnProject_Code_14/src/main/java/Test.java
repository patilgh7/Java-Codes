import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		
		// Spring.xml madhe depends-on="b" ani depends-on="c" kelyamul aplyala getBean() method call karnyachi garaj nahi
	}

}
