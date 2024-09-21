package com.knockknock.oop.cooking;

import com.knockknock.oop.cook.Cook;
import com.knockknock.oop.menu.Menu;
import com.knockknock.oop.menu.item.MenuItem;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        return new Cook(menuItem);
    }
}
