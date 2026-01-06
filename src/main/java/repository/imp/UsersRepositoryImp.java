package repository.imp;

import config.HibernateUtil;
import model.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import repository.UsersRepository;

public class UsersRepositoryImp implements UsersRepository {

    @Override
    public Users authenticateUser(String email, String password) {
        Session session= HibernateUtil.getSessionFactory().openSession();
        String sql="FROM Users User WHERE u.email = :email";
        return session.createQuery(sql, Users.class)
                .setParameter("email", email)
                .uniqueResult();

    }
}
