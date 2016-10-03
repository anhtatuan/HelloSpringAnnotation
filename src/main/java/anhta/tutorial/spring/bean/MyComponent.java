package anhta.tutorial.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*@Component là một annotation, nó được chú thích trên một 
 * class để nói với Spring rằng class này là một Spring BEAN. 
 * */
@Component
public class MyComponent {

	@Autowired
	private MyRepository myRepository;

	/*
	 * @Autowired được chú thích trên một trường (field) để nói với Spring rằng
	 * hãy tiêm (inject) giá trị vào cho trường đó. Chú ý: Từ tiêm ở đây có ý
	 * giống với gán giá trị cho trường đó.
	 */
	public void showAppInfo() {
		System.out.println("Now is: " + myRepository.getSysDateTime());
		System.out.println("App Name: " + myRepository.getAppName());
	}

}
