package com.knockknock.oop.cook;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CookTest {

    @DisplayName("요리를 생성한다.")
    @Test
    void create_success() {
        Assertions.assertThatCode(() -> new Cook("닭갈비", 10000))
                .doesNotThrowAnyException();
    }
}
