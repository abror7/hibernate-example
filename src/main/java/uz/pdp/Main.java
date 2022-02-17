package uz.pdp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import uz.pdp.model.*;
import uz.pdp.model.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;
//import uz.pdp.model.template.FullName;

public class Main {
    public static void main(String[] args) {
//        Product product = new Product();
//
//        product.setId(7);
//        product.setName("HP Laptop");
//        product.setPrice(2000.0);


        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();


//        session.save(new Category(5, "Smartphones", true));
//        session.save(new Product(7, "Iphone", 2000.0));
//        Product product = session.get(Product.class, 7);

//        System.out.println("Category successfully saved");

//        ==========================================
//        Employee employee = new Employee();
//        employee.setFullName(new FullName("first name 124124", "last name sdgsdfgh", "father's name zxcvzxv"));
//        session.save(employee);
//        System.out.println(session.get(Employee.class, 1));
//        ==========================================


//        ===================ONE TO ONE =======================
//        Employee employee = new Employee();
//        employee.setFullName("Abror Ergashev");
//
//        session.save(employee);
//

//        Employee employee = session.get(Employee.class, 1); // optional


//        Passport passport = new Passport();
//        passport.setEmployee(employee);
//        passport.setSerialNumber("AA214125");
//        session.save(passport);
//        ==========================================


//        ===================ONE TO MANY / MANY TO ONE======================


//        Group b7 = new Group();
//        b7.setName("B7");
//        session.save(b7);
//
//        Group b6 = new Group();
//        b6.setName("B6");
//        session.save(b6);
////
//        Student student1 = new Student("Muhammad", b7);
//        Student student2 = new Student("Bekzod", b7);
//        Student student3 = new Student("Avaz", b6);
//        Student student4 = new Student("Sfsadfa", b6);
//        session.save(student1);
//        session.save(student2);
//        session.save(student3);

//        =========================================

//        ===================MANY TO MANY======================
//

//        Teacher teacher = new Teacher();
//        teacher.setFullName("Sevinch Abdisattorova");
//
//        List<Student> sevinchStudentList = new ArrayList<>();
//        sevinchStudentList.add(student1);
//        sevinchStudentList.add(student2);
//        sevinchStudentList.add(student3);
//
//        teacher.setStudents(sevinchStudentList);
//
//        session.save(teacher);

//        =========================================


//        ===================FETCH TYPE======================

//        Teacher teacher = session.get(Teacher.class, 3);
//        System.out.println(teacher);
//        System.out.println(teacher.getStudents());

//        =========================================


//        ==================== HQL - HIBERNATE QUERY LANGUAGE =====================
        // select column_name from table_name; SQL
        //  from class_name; HQL


//        Query query = session.createQuery("from Student");
//        List<Student> list = query.list();
//
//        System.out.println("student list: " + list);

//        Query query = session.createQuery("from Student where fullName = 'Muhammad'");
//        Student student = (Student) query.uniqueResult();
//
//        System.out.println(student);

//        =========================================

//        ==================== NATIVE QUERY =====================


        NativeQuery sqlQuery = session.createSQLQuery("select * from  student where fullname like 'A%'");

        sqlQuery.addEntity(Student.class);
        List<Student> list1 = (List<Student>) sqlQuery.list();

        System.out.println(list1);

//        =========================================

        t.commit();
        factory.close();
        session.close();
    }
}
