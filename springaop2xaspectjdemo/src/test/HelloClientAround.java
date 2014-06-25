package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.generic.GenericBeanFactoryAccessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.service.IHelloWorldService;

/**
 * 
 * @author worldheart
 * 
 */
public class HelloClientAround {

	protected static final Log log = LogFactory.getLog(HelloClientAround.class);

	public static void main(String[] args) {

		ListableBeanFactory factory = new ClassPathXmlApplicationContext("around.xml");
		GenericBeanFactoryAccessor gbfa = new GenericBeanFactoryAccessor(
				factory);

		IHelloWorldService hw = gbfa.getBean("helloworldService");

		String str = hw.getContent("worldheart"); 
		
		log.info(str);

	}

}
