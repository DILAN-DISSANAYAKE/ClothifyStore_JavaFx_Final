package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private String productId;
    private String name;
    private String category;
    private String size;
    private double price;
    private int qty;
    private String image;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplierId;
}
