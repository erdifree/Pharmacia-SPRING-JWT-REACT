package it.ErdisonDosti.converter;


import it.ErdisonDosti.dto.OrdersDTO;
import it.ErdisonDosti.entity.Orders;
import org.springframework.stereotype.Component;

@Component
public class OrdersConverter extends  AbstractConverter<Orders, OrdersDTO> {
    @Override
    public Orders toEntity(OrdersDTO ordersDTO) {
       Orders orders=null;
       if (ordersDTO !=null){
           orders=Orders
                   .builder()
                   .id(ordersDTO.getId())
                   .aquired(ordersDTO.getAquired())
                   .isPayed(ordersDTO.isPayed())
                   .totalPrice(ordersDTO.getTotalPrice())
                   .build();
       }
       return orders;
    }

    @Override
    public OrdersDTO toDTO(Orders orders) {
        OrdersDTO ordersDTO=null;
        if (orders !=null){
            ordersDTO=OrdersDTO
                    .builder()
                    .id(orders.getId())
                    .aquired(orders.getAquired())
                    .isPayed(orders.isPayed())
                    .totalPrice(orders.getTotalPrice())
                    .build();
        }
        return ordersDTO;
    }
}
