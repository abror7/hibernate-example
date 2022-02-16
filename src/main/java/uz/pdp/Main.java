package uz.pdp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import uz.pdp.model.Category;
import uz.pdp.model.Product;

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


        session.save(new Category(5, "Smartphones", true));
        session.save(new Product(7, "Iphone", 2000.0, null));

        t.commit();

        System.out.println("Category successfully saved");
        factory.close();
        session.close();


    }
}
