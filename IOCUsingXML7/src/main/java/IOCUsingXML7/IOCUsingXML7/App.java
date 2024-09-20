package IOCUsingXML7.IOCUsingXML7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import IOCUsingXML7.IOCUsingXML7.Implemets.JS;
import IOCUsingXML7.IOCUsingXML7.Implemets.Java;
import IOCUsingXML7.IOCUsingXML7.Implemets.SQL;

public class App {

    public static void main( String[] args ) {
    
    	//Inject the data by Setter and Constructor injection using xml file.
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    	Java java = (Java)ac.getBean("java");
    	SQL sql =(SQL) ac.getBean("sql");
    	JS js = (JS) ac.getBean("js");
	
    		java.disp();
    		System.out.println();
    		sql.disp();
    		System.out.println();
    		js.disp();
    		
    	
    	
       
    }
}
