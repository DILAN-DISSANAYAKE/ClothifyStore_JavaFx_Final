package service;

import model.dto.UsersDTO;

public interface UsersService {
    UsersDTO authenticateUser(String email, String password);
}
