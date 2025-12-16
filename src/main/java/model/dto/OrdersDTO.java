package model.dto;

import jakarta.persistence.*;
import lombok.*;
import model.entity.Customer;
import model.entity.OrderDetails;
import model.entity.Users;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrdersDTO {
    private String orderId;
    private LocalDate orderDate;
    private Customer customerId;
    private Users userId;

    private List<OrderDetails> orderDetailsList;
}
