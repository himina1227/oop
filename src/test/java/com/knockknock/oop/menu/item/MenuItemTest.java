package com.knockknock.oop.menu.item;

import com.knockknock.oop.cook.Cook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {

    @DisplayName("요리를 생성한다.")
    @Test
    void create_Success() {
        assertThatCode(() -> new MenuItem("닭갈비", 10000))
                .doesNotThrowAnyException();
    }
}
