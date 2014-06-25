package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 构建ApplicationContext
 * 
 * @author worldheart
 *
 */
public class ApplicationContextConstructDemo1 {

	protected static final Log log = LogFactory.getLog(ApplicationContextConstructDemo1.class);
	
	public static void main(String[] args){
		
		//在classpath根路径查找resource1.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("resource1.xml");
		
		//在classpath test路径查找resource2.xml
		ac = new ClassPathXmlApplicationContext("classpath:test/resource2.xml");
		
		//在TestBean类所在classpath定位resource2.xml
		ac = new ClassPathXmlApplicationContext("resource2.xml", TestBean.class);
		
		//通过URL定位resource1.xml
		ac= new ClassPathXmlApplicationContext("file:D:/eclipse/workspace/resourcedemo/src/resource1.xml");

		//直接传入文件路径
		ac = new FileSystemXmlApplicationContext("D:/eclipse/workspace/resourcedemo/src/test/resource2.xml");
		
		//通过classpath定位resource2.xml
		ac = new FileSystemXmlApplicationContext("classpath:test/resource2.xml");
		
	}
	
}
