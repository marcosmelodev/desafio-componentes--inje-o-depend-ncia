package com.devsuperior.desafioComponentes.services;

import com.devsuperior.desafioComponentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double shippment = 0.00;
        if (order.getBasic() < 100) {
            shippment = 20.00;
        } else if (order.getBasic() >= 100.00 && order.getBasic() < 200.00) {
            shippment = 12.00;
        } else if (order.getBasic() >= 200.00) {
            shippment = 0.00;
        }
        return shippment;
    }

}
