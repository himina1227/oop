package com.knockknock.oop.menu;

import com.knockknock.oop.menu.item.MenuItem;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class MenuTest {

    @Test
    void create_success() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 10000), new MenuItem("냉면", 10000)));
        assertThat(menu.choose("돈까스")).isEqualTo(new MenuItem("돈까스", 10000));
    }
}
