package com.subprj.domain;

import com.subprj.domain.orderItem.OrderItem;
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

        public Order toEntity() {
            return Order.builder()
                    .orderName(orderName)
                    .deliveryInfo(DeliveryInfo.builder()
                            .receiverName(receiverName)
                            .receiverPhoneNumber(payer)
                            .zipCode(zipCode)
                            .address1(address1)
                            .address2(address2)
                            .build())
                    .paymentInfo(PaymentInfo.builder()
                            .payer(payer)
                            .paymentMethod(PaymentInfo.PaymentMethod.valueOf(paymentMethod))
                            .build())
                    .itemList(itemList.stream().map(RegisterOrderItem::toEntity).toList())
                    .build();
        }
    }

    @Getter
    @AllArgsConstructor
    public static class RegisterOrderItem {
        private final String itemName;
        private final Integer itemCount;
        private final BigDecimal itemAmount;

        public OrderItem toEntity() {
            return OrderItem.builder()
                    .itemName(itemName)
                    .itemCount(itemCount)
                    .itemAmount(itemAmount)
                    .build();
        }
    }
}
