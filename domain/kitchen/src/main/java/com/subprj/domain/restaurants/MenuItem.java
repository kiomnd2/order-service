package com.subprj.domain.restaurants;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;


@NoArgsConstructor
@Embeddable
public class MenuItem implements Serializable {

    @Column
    private String menuItemId;
    @Column
    private int quantity;

    @Builder
    public MenuItem(String menuItemId, int quantity) {
        this.menuItemId = menuItemId;
        this.quantity = quantity;
    }
}
