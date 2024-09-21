package com.knockknock.oop.menu;

import com.knockknock.oop.menu.item.MenuItem;
import lombok.Getter;

import java.util.List;

@Getter
public class Menu {
    private List<MenuItem> menuItems;


    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(String name) {
        return new MenuItem("돈까스", 10000);
    }
}
