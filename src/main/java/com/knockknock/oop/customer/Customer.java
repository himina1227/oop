package com.knockknock.oop.customer;

import com.knockknock.oop.cook.Cook;
import com.knockknock.oop.cooking.Cooking;
import com.knockknock.oop.menu.Menu;
import com.knockknock.oop.menu.item.MenuItem;

public class Customer {
    public static void order(String menuName, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(menuName);
        Cook cook = cooking.makeCook(menuItem);

    }
}
