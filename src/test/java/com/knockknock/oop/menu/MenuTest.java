package com.knockknock.oop.menu;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class MenuTest {

    @Test
    void create_success() {
        assertThatCode(() -> new Menu("닭갈비", 10000))
                .doesNotThrowAnyException();
    }
}
