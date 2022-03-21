package SpringCoreAutowireAtc.com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("SpringCoreAutowireAtc.com.springcore")
public class App {
  public static void main(String[] args) {
	  
	  ApplicationContext factory = new AnnotationConfigApplicationContext(App.class);
	  
	  Employee e = (Employee) factory.getBean("employee");
	  e.setEid(1);
	  e.setEname("Wolf");
	  
	  Address a = (Address) factory.getBean("address");
	  a.setColony("old road town");
	  e.setAddress(a);
	  
	  
	  System.out.println(e);
	  
  }
}
