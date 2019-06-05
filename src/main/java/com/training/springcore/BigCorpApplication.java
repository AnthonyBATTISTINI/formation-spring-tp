package com.training.springcore;

import com.training.springcore.service.SiteService;
import com.training.springcore.service.SiteServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BigCorpApplication {

    public static void main (String[] args){
        BigCorpApplication application = new BigCorpApplication();
        application.run();
    }

    public void run(){
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BigCorpApplicationConfig.class);
        System.out.println("Application startup");
        //ObjectFactory factory = new ObjectFactory();
        //SiteService siteService = factory.createSiteService();
        SiteService siteService = context.getBean(SiteService.class);//ou SiteService siteService = (SiteService) context.getBean("siteService");
        System.out.println(siteService.findById("siteA"));
        SiteService siteService2 = context.getBean(SiteService.class);
        System.out.println(siteService2.findById("siteA"));
    }
}
