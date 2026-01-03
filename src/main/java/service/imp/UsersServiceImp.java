package service.imp;

import model.dto.UsersDTO;
import model.enums.Role;
import service.UsersService;

public class UsersServiceImp implements UsersService {
    @Override
    public UsersDTO authenticateUser(String email, String password) {
        UsersDTO usersDTO = new UsersDTO();
        if (email.equals("admin@gmail.com")&&password.equals("1234")){
            usersDTO.setExists(true);
            usersDTO.setName("Dilan");
            usersDTO.setRole(Role.ADMIN);
            return usersDTO;
        }

        return usersDTO;
    }
}
