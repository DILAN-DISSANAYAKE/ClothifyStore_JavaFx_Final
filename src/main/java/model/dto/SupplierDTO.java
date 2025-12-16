package model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SupplierDTO {
    private String supplierId;
    private String name;
    private String company;
    private String email;
    private String contact;

}
