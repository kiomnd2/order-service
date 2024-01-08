package com.subprj.domain.interfaces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

public class OrderDto {

    @Getter
    @Setter
    @ToString
    public static class RequestOrder {
        private String orderName;
        private String receiverName;
        private String receiverPhoneNumber;
        private String zipCode;
        private String address1;
        private String address2;
        private String payer;
        private String paymentMethod;
        private List<RequestOrderItem> orderItems;
    }

    public static class RequestOrderItem {
        private String itemName;
        private String itemCount;
        private BigDecimal itemAmount;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    public static class ResponseOrder {
        private String token;

    }
}
