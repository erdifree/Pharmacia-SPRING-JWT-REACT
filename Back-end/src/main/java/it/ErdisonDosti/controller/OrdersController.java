package it.ErdisonDosti.controller;


import it.ErdisonDosti.dto.OrdersDTO;
import it.ErdisonDosti.entity.Orders;
import it.ErdisonDosti.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/orders")
@RequiredArgsConstructor
public class OrdersController {

    private final OrderService service;

    @GetMapping
    public Iterable<OrdersDTO> getAllOrdersOfAuthenticateUser(){
     return service.getAllOrders();
    }
}
