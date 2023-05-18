package it.ErdisonDosti.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import it.ErdisonDosti.entity.RegisterUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdersDTO {
    private Integer id;
    private LocalDateTime aquired;
    private boolean isPayed;
    private Double totalPrice;
    private RegisterUser registeruser;

}
