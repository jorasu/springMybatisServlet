package com.kgc.test;

import com.kgc.pojo.Student;
import com.kgc.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by jora on 2019/5/7.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService st=(StudentService)ac.getBean("studentServiceImpl");
        List<Student> students=st.queryAll();
        students.forEach(student -> System.out.println(student));

    }
}
