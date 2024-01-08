package com.subprj.domain.orderItem;

import antlr.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_orderItem")
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemName;
    private BigDecimal itemAmount;
    private Integer itemCount;

    @Builder
    public OrderItem(String itemName, BigDecimal itemAmount, Integer itemCount) {
        this.itemName = itemName;
        this.itemAmount = itemAmount;
        this.itemCount = itemCount;
    }
}
