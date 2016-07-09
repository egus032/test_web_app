/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test_web_app.controllers;

import com.mycompany.test_web_app.dao.UserDao;
import com.mycompany.test_web_app.dao.UserDaoImpl;
import com.mycompany.test_web_app.models.User;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author eguseynov
 */
@Controller
public class IndexController {

    private final Log log = LogFactory.getLog(IndexController.class);
    
    @Autowired
    private UserDao userDao;
    
    
    
    
    
}
