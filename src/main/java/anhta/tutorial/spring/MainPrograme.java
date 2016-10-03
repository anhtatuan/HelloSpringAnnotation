package anhta.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import anhta.tutorial.spring.bean.GreetingService;
import anhta.tutorial.spring.bean.MyComponent;
import anhta.tutorial.spring.config.AppConfiguration;
import anhta.tutorial.spring.lang.Language;

public class MainPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tạo ra một đối tượng ApplicationContext bằng cách đọc cấu hỉnh
		// trong class AppConfiguration
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		System.out.println("---------------");
		Language language = (Language) context.getBean("language");
		System.out.println("Bean language: "+ language);
		System.out.println("Say bye: " + language.getBye());
		
		System.out.println("---------------");
		GreetingService service = (GreetingService) context.getBean("greetingService");
		service.sayGreeting();
		
		System.out.println("---------------");
		MyComponent myComponent = (MyComponent) context.getBean("myComponent");
		myComponent.showAppInfo();
	}
}
