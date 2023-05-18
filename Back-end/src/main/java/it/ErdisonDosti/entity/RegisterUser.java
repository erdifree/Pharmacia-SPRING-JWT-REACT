package it.ErdisonDosti.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class RegisterUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String lastname;

    private LocalDate dob;

    private String   address;

    private String country;

    private String city;

    private Integer  zipCode;

    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;


//    @OneToMany(mappedBy = "registered_user", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JsonManagedReference
//    private List<Orders> orders = new ArrayList<>();



}
