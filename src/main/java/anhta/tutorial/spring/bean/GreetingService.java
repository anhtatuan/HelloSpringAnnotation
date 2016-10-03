package anhta.tutorial.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import anhta.tutorial.spring.lang.Language;

/*
 * @Service là một annotation, nó được sử dụng để chú thích trên một class để
 * nói với Spring rằng class đó là một Spring BEAN.
 */
@Service
public class GreetingService {

	/*
	 * @Autowired được chú thích trên một trường (field) để nói với Spring rằng
	 * hãy tiêm (inject) giá trị vào cho trường đó. Chú ý: Từ tiêm ở đây có ý
	 * giống với gán giá trị cho trường đó.
	 */
	@Autowired
	private Language language;
	
	public void sayGreeting() {
		String greeting = language.getGreeting();
		
		System.out.println("Greeting: " + greeting);
	}
}
