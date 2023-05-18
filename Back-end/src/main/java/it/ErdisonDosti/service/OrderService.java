package it.ErdisonDosti.service;

import it.ErdisonDosti.converter.OrdersConverter;
import it.ErdisonDosti.dao.Ordersrepository;
import it.ErdisonDosti.dao.UserRepository;
import it.ErdisonDosti.dto.OrdersDTO;
import it.ErdisonDosti.dto.UserDTO;
import it.ErdisonDosti.entity.Orders;
import it.ErdisonDosti.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.print.attribute.standard.OrientationRequested;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrdersConverter converter;
    @Autowired
    private Ordersrepository ordersrepository;


    private final UserRepository userRepository;


    /*Method to get all Orders of User Logged  still to pay*/
    public Iterable<OrdersDTO> getAllOrders() {
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            UserDetails userDetails= (UserDetails) authentication.getPrincipal();
         Optional<User> result=userRepository.findByEmail(userDetails.getUsername());
         var userList=result.get().getPharmacia().getOrders().stream().filter(orders -> orders.isPayed()==false).toList();
         return  converter.toDTOList(userList);
        } else {
            throw  new ResponseStatusException(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
        }

    }
}
