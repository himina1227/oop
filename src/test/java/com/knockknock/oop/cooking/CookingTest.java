package com.knockknock.oop.cooking;

import com.knockknock.oop.cook.Cook;
import com.knockknock.oop.menu.item.MenuItem;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CookingTest {

    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("햄버거", 10000);

        Cook cook =cooking.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook(menuItem));
    }
}
