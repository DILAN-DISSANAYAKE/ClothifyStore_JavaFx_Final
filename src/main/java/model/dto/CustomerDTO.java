package model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {

    private String customerId;
    private String name;
    private String contact;
    private String address;
    private String email;
    private LocalDate joinedDate;

}
