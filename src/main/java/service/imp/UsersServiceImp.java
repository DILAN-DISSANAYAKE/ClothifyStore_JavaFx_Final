package service.imp;

import model.dto.UsersDTO;
import model.enums.Role;
import repository.UsersRepository;
import repository.imp.UsersRepositoryImp;
import service.UsersService;

public class UsersServiceImp implements UsersService {
    private final UsersRepository usersRepository=new UsersRepositoryImp();
    @Override
    public UsersDTO authenticateUser(String email, String password) {
        usersRepository.authenticateUser(email,password);
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
