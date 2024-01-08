package com.subprj.domain.orderItem;

import antlr.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_orderItem")
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemName;
    private Integer itemCount;

    @Builder
    public OrderItem(String itemName, Integer itemCount) {
        this.itemName = itemName;
        this.itemCount = itemCount;
    }
}
