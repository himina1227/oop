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
        return this.menuItems.stream().filter(menuItem -> menuItem.matches(name))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("잘못된 메뉴 이름"));
    }
}
