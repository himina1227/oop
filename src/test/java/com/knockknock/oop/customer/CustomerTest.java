package com.knockknock.oop.customer;

import com.knockknock.oop.cooking.Cooking;
import com.knockknock.oop.menu.Menu;
import com.knockknock.oop.menu.item.MenuItem;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class CustomerTest {

    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 10000), new MenuItem("냉면", 10000)));
        Cooking cooking = new Cooking();
        assertThatCode(() -> Customer.order("돈까스", menu, cooking))
                .doesNotThrowAnyException();
    }
}
