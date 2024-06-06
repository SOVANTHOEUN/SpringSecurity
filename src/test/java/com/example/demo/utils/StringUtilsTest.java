package com.example.demo.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isEmail() {
        assertTrue(StringUtils.isEmail("sovanthoeun@gmail.kr.co"));
    }
}