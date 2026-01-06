package repository;

import model.entity.Users;

public interface UsersRepository {

    Users authenticateUser(String email, String password);
}
