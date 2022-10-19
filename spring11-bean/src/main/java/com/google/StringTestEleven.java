package com.google;


import org.springframework.context.annotation.DependsOn;

@Deprecated
@DependsOn
public class  StringTestEleven {
	public static void main(String[] args) {
		/*System.out.println("123456");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println(applicationContext);
		MyTestBean myTestBean = (MyTestBean)applicationContext.getBean("myTestBean");
		String testStr = myTestBean.getTestStr();
		System.out.println(testStr);
		ClassPathResource classPathResource = new ClassPathResource("bean.xml");
		System.out.println(classPathResource);
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		System.out.println(beanFactory);
		 */
		System.out.println("123456");
	}
}