package com.subprj.infrastructure;

import com.subprj.domain.Order;
import com.subprj.domain.OrderStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class OrderStoreImpl implements OrderStore {
    private final OrderRepository orderRepository;
    @Override
    public Order store(Order order) {
        return orderRepository.save(order);
    }
}
