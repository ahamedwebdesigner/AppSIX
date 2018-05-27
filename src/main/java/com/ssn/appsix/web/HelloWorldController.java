package com.ssn.appsix.web;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletContext;

import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	@Autowired
	private ApplicationContext applicationContext; //WebApplicationContext
	
	@Autowired
	private ServletContext servletContext; // org.apache.catalina.core.ApplicationContextFacade
	
	@Autowired
	private WebApplicationContext wc;
	
	
	@Autowired
	private DriverManagerDataSource dc;
	
	@Autowired
	private LocalSessionFactoryBean sessionFactory;
	
	
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
    	
    	
    

		 

    	
	
/*		 
		 try {
			Connection con = dc.getConnection();
			
			String query = "SELECT VERSION()";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			if (rs.next()) {
				System.out.println(rs.getString(1));
			}
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}*/
		 
    	
	

		 LogRootWebApplicationContextBeans();
		 LogwebApplicationContextBeans();
		 LogModels();
		
		
			
			
		 
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }
 
    @RequestMapping(value="/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("message", "Hellow again for  sayHelloAgain ");
        return "welcome";
    }
    
    
    
    
    // utility method for logging loaded models in hibernate
    public void LogModels() {
    	SessionFactory sf = sessionFactory.getObject();
		 
			Map<String, ClassMetadata>  map = (Map<String, ClassMetadata>) sf.getAllClassMetadata();
			
			System.out.println("----------------------------------------------------");
			System.out.printf("%-50s%-22s\n","Class Name","Database Table name");
			System.out.println("----------------------------------------------------");
			
			for(String entityName : map.keySet()){
		        SessionFactoryImpl sfImpl = (SessionFactoryImpl) sf;
		        String tableName = ((AbstractEntityPersister)sfImpl.getEntityPersister(entityName)).getTableName();
		        System.out.printf("%-50s%-22s\n",entityName,tableName);
		        
		    }
			System.out.println("----------------------------------------------------");
			System.out.println("========================================================================");
    }
    
    
    
    public void LogRootWebApplicationContextBeans() {
		 System.out.println("====================   Root WebApplicationContext  ===============================\n");
		 WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		 Arrays.stream(ctx.getBeanDefinitionNames()).sorted().forEach(System.out::println);
		 System.out.println("===================================================================================\n\n\n\n\n");
		 
    }
    
    public void LogwebApplicationContextBeans() {
		 System.out.println("====================  WebApplicationContext ===============================\n");
		 Arrays.stream(applicationContext.getBeanDefinitionNames()).sorted().forEach(System.out::println);
		 System.out.println("============================================================================\n\n");
	 }
 
}