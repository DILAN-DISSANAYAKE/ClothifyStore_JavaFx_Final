package config;

import model.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private HibernateUtil(){}
    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            Configuration configuration=new Configuration();
            configuration.addAnnotatedClass(Users.class);
            configuration.addAnnotatedClass(Customer.class);
            configuration.addAnnotatedClass(Orders.class);
            configuration.addAnnotatedClass(OrderDetails.class);
            configuration.addAnnotatedClass(Supplier.class);
            configuration.addAnnotatedClass(Product.class);
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();

        }
        return sessionFactory;
    }
}
