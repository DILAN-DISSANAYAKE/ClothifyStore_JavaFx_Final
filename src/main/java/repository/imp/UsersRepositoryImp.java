package repository.imp;

import config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import repository.UsersRepository;

public class UsersRepositoryImp implements UsersRepository {

    @Override
    public void authenticateUser(String email, String password) {
        Session session= HibernateUtil.getSessionFactory().openSession();

    }
}
