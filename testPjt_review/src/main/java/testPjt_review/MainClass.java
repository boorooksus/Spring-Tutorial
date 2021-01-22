package testPjt_review;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		TransWalk transWalk = new TransWalk();
//		transWalk.move();
		
		// 새로운 방법
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransWalk transWalk = ctx.getBean("tWalk", TransWalk.class);
		transWalk.move();
		
		ctx.close();
	}
}
