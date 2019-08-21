package com.kgc.servlet;

import com.kgc.pojo.Student;
import com.kgc.service.StudentService;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by jora on 2019/5/7.
 */
@WebServlet(urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService st=(StudentService)ac.getBean("studentServiceImpl");
        List<Student> students=st.queryAll();
        request.setAttribute("students",students);
        request.getRequestDispatcher("query.jsp").forward(request,response);
    }
}
