package it.ErdisonDosti.dto;



import it.ErdisonDosti.entity.Orders;
import it.ErdisonDosti.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserDto {

    private Integer id;

    private String name;

    private String lastname;

    private LocalDate dob;

    private String   address;

    private String country;

    private String city;

    private Integer  zipCode;

    private List<Orders> ordersList;





}
