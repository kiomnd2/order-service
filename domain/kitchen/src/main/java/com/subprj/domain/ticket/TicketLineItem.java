package com.subprj.domain.ticket;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@NoArgsConstructor
@Getter
@Embeddable
@Access(AccessType.FIELD)
public class TicketLineItem {

    private int quantity;

    private String menuItemId;

    private String name;

    @Builder
    public TicketLineItem(int quantity, String menuItemId, String name) {
        this.quantity = quantity;
        this.menuItemId = menuItemId;
        this.name = name;
    }
}
