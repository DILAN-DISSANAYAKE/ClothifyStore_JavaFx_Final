package repository;

public interface UsersRepository {

    void authenticateUser(String email, String password);
}
