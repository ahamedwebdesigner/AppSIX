package com.ssn.appsix.web;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AppInfoInterceptor implements HandlerInterceptor {

	
	@Autowired
	private ServletContext servletContext;
	
	
	@Autowired
	private ApplicationContext applicationContext; //WebApplicationContext
	

	@Autowired
	private DriverManagerDataSource dc;
	
	@Autowired
	private LocalSessionFactoryBean sessionFactory;
	
	
	
	
	 Logger logger = LoggerFactory.getLogger(AppInfoInterceptor.class);


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		 LogRootWebApplicationContextBeans();
		 LogwebApplicationContextBeans();
		 LogModels();
		

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	
	
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
