/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test_web_app.tests;

import com.mycompany.test_web_app.dao.UserDao;
import com.mycompany.test_web_app.models.User;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author eguseynov
 */
/*
вместо тестовых классов, т.к. не умею писать юнит-тесты
*/
public class MainTestApp {
    
    public static void main(String[] args) {
        
        GenericXmlApplicationContext gxac = new GenericXmlApplicationContext();
        String resource = "file:\\Users\\eguseynov\\Documents\\NetBeansProjects\\test_web_app\\src\\main\\webapp\\WEB-INF\\root-context.xml";
        gxac.load(resource);
        gxac.refresh();
        
        UserDao userDao = gxac.getBean("userDao", UserDao.class);
        
        
        
                
        
        
        
    }
    
    
}
