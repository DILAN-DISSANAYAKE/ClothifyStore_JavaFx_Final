package model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import model.enums.Role;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsersDTO {
    private Integer userId;
    private String email;
    private String password;
    private Role role;
    private String name;
    private String contact;
    private String address;
    private LocalDate joinedDate;
    private boolean isExists;
}
