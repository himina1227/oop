package com.knockknock.oop.cook;

import com.knockknock.oop.menu.Menu;
import com.knockknock.oop.menu.item.MenuItem;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Cook {

    private String name;
    private int price;

    public Cook(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Cook(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
    }
}
