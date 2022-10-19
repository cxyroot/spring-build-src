import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext("com.google");
		annotationConfigApplicationContext.start();

	}
}
