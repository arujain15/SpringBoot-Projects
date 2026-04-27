package com.arushi.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arushi.ston.Printer;

public class SpringBeanScopesTest {
	
	public static void main(String[] args) {
		 //create IOC container
		try(ClassPathXmlApplicationContext  ctx=
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			  //get target spring bean class obj  ref
				/*WishMessageGenerator  generator1=ctx.getBean("wmg",WishMessageGenerator.class);
				WishMessageGenerator  generator2=ctx.getBean("wmg",WishMessageGenerator.class);
				System.out.println(generator1.hashCode()+"...."+generator2.hashCode());
				System.out.println("generator1==generator2?"+(generator1==generator2));
				*/
			  Printer p1=ctx.getBean("prn1",Printer.class);
			  Printer p2=ctx.getBean("prn1",Printer.class);
			  System.out.println(p1.hashCode()+" "+p2.hashCode());
			  
			  Printer p11=ctx.getBean("prn2",Printer.class);
			  Printer p22=ctx.getBean("prn2",Printer.class);
			  System.out.println(p11.hashCode()+" "+p22.hashCode());

		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
