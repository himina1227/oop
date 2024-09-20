package com.knockknock.oop.cook;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CookTest {

    @DisplayName("요리를 생성한다.")
    @Test
    void create_Success() {
        assertThatCode(() -> new Cook("닭갈비", 10000))
                .doesNotThrowAnyException();
    }

//    @Test
//    void create_WhenPriceIsZero_ThrowsException() {
//        assertThatCode(() -> new Cook("닭갈비", 0))
//                .isInstanceOf(NotPriceZeroException.class);
//    }
}
