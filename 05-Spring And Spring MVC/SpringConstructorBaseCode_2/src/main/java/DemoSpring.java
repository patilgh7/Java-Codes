import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoSpring {

	public static void main(String[] args) {

		/*
		 * Using Resource Interface => 1st Way
		 * 
		 * Resource resource = new ClassPathResource("spring.xml");
		 * System.out.println("Step 1");
		 * 
		 * BeanFactory beanFactory = new XmlBeanFactory(resource);
		 * System.out.println("Step 2");
		 * 
		 * Student student = (Student) beanFactory.getBean("s"); //
		 * beanFactory.getBean("s") he map kel spring.xml madhlya id = "s" la
		 * System.out.println(student);
		 * 
		 */

		// Using ApplicationContext Interface => 2nd way

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Step 1");
		
		//Comstructor Based Injection
		
		Student student3 = (Student) applicationContext.getBean("s3");
		System.out.println(student3);
	}

}
