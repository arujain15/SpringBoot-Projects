package com.arushi.main;

import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arushi.sbeans.WishMessageGenerator;

public class DependencyMgmtTest {
	public static void main(String[] args) {
		 //create  IOC container
			/*FileSystemXmlApplicationContext  ctx=
					  new FileSystemXmlApplicationContext("src/com/arushi/cfgs/applicationContext.xml");
			*/
			/*FileSystemXmlApplicationContext ctx=
				   new FileSystemXmlApplicationContext("C:\Users\HP\eclipse-SelfSpring\IOCProj01_DependencyMgmtUsingXmlDrivenCfgs\src\com\arushi\cfgs\applicationContext.xml");
			*/ 
			/*ClassPathXmlApplicationContext  ctx=
					  new  ClassPathXmlApplicationContext("com/arushi/cfgs/applicationContext.xml");
			*/
		ClassPathXmlApplicationContext  ctx=
				  new  ClassPathXmlApplicationContext("com/arushi/cfgs/applicationContext.xml");
		        
		        
		//get target spring bean class obj ref
	       WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
	     	 //invoke the b.method
			 String result=generator.showWishMessage("Arushi");
			 System.out.println(result);
			 
			 LocalTime  time=ctx.getBean("ltime",LocalTime.class);
			 System.out.println(time);
			 
			 System.out.println("-----------------------------");
			 Class clazz=WishMessageGenerator.class;
			 System.out.println("class name ::"+clazz.getName());
			 System.out.println("super class name::"+clazz.getSuperclass());
			 System.out.println("methods  ::"+Arrays.toString(clazz.getDeclaredMethods()));
			 System.out.println("fileds ::"+Arrays.toString(clazz.getFields()));
			 
	       //close  the  IOC container
	       ctx.close();

	}//main
}
