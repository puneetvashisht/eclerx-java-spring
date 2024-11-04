package com.eclerx;

import com.eclerx.services.TransferService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application.xml")
public class TransferServiceTest {

    @Autowired
    TransferService transService;

    @Test
    public void testTransferServiceExecute(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        String beans[] = context.getBeanDefinitionNames();
//        for(String beanName: beans){
//            System.out.println(beanName);
//        }
//        TransferService transService = context.getBean(TransferService.class);
        transService.execute();
    }
}
