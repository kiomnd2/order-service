package com.subprj.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

public class OrderCommand {

    @Getter
    @AllArgsConstructor
    public static class RegisterOrder {
        private final String orderName;
        private final String receiverName;
        private final String receiverPhoneNumber;
        private final String zipCode;
        private final String address1;
        private final String address2;
        private final String payer;
        private final String paymentMethod;
        private final List<RegisterOrderItem> itemList;
    }

    @Getter
    @AllArgsConstructor
    public static class RegisterOrderItem {
        private final String itemName;
        private final String itemCount;
        private final BigDecimal itemAmount;
    }
}
