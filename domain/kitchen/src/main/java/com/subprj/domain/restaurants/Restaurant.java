package com.subprj.domain.restaurants;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "tb_restaurant")
@Access(AccessType.FIELD)
public class Restaurant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "kitchen_menu_items")
    private List<MenuItem> menuItem;

    @Builder
    public Restaurant(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }
}
