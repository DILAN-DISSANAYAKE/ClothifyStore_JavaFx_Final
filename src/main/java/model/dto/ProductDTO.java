package model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import model.entity.Supplier;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {
    private String productId;
    private String name;
    private String category;
    private String size;
    private double price;
    private int qty;
    private String image;
    private Supplier supplierId;
}
