package com.subprj.domain;

import com.subprj.common.utils.TokenGenerateUtil;
import com.subprj.domain.orderItem.OrderItem;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "tb_order")
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String orderToken;
    private String orderName;
    private ZonedDateTime orderAt;
    @Embedded
    private DeliveryInfo deliveryInfo;
    @Embedded
    private PaymentInfo paymentInfo;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item_id")
    private List<OrderItem> itemList = new ArrayList<>();

    @Builder
    public Order(String orderName, ZonedDateTime orderAt, DeliveryInfo deliveryInfo
            , PaymentInfo paymentInfo, List<OrderItem> itemList) {
        this.orderToken = TokenGenerateUtil.generateToken();
        this.orderName = orderName;
        this.orderAt = orderAt;
        this.deliveryInfo = deliveryInfo;
        this.paymentInfo = paymentInfo;
        this.itemList = itemList;
    }
}
