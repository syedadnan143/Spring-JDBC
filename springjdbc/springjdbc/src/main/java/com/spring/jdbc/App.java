package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao =    context.getBean("studentDao",StudentDao.class );
//        insert
        Student student = new Student();
        student.setID(150);
        student.setName("junaid");
        student.setCity("tolichowki");
        int result =studentDao.insert(student);
        System.out.println("student added " +result);
//        update
//        Student student = new Student();
//        student.setID(310);
//        student.setCity("Hyderabad");
//        student.setName("Ansar Ahmed");
//        int result =studentDao.insert(student);
//        System.out.println("Student updated" + result);
////        deleteing
//        int result =studentDao.delete(201);
//        System.out.println("Student deleted" + result);
          
//          Student student = studentDao.getstudent(101);
//          System.out.println(student);
// 
//         multiple 
        List<Student>students= studentDao.getAllStudent();
        for (Student s : students){
        	System.out.println(s);
        }
    }
}
