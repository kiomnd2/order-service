package com.subprj.domain.ticket;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "tb_tickets")
@Access(AccessType.FIELD)
public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TicketState state;
    private Long restaurantId;
    private LocalDateTime readyBy;
    private LocalDateTime acceptTime;
    private LocalDateTime preparingTime;
    private LocalDateTime pickedUpTime;
    private LocalDateTime readyForPickupTime;

    @ElementCollection
    @CollectionTable(name = "ticket_line_items")
    private List<TicketLineItem> lineItems;

    public enum TicketState {
        CREATE_PENDING, AWAITING_ACCEPTANCE, ACCEPTED, PREPARING, READY_FOR_PICKUP, PICKED_UP, CANCEL_PENDING, CANCELLED, REVISION_PENDING,
    }
}
