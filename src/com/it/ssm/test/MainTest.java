package com.it.ssm.test;

import com.it.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-application.xml")
public class MainTest {
    @Autowired
 private UserService userService;
    @Test
 public void testGetUser(){
     System.out.println(userService);
 }
}
