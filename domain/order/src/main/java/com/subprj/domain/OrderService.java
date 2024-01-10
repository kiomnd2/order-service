package com.subprj.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderStore orderStore;


    public String registerOrder(OrderCommand.RegisterOrder registerOrder) {
        return orderStore.store(registerOrder.toEntity()).getOrderToken();
    }
}
