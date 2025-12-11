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
public class OrderDetails {
    @Id
    private String orderDetailId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders ordersId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    private int qty;
}
