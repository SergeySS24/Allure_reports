package com.FromLecture;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.annotation.*;

public class ParametersTest {


   @Test
   @DisplayName("Мой любимый хряк")
    public void testAnnotated() {
       Allure.parameter("Регион", "Московская область");
       Allure.parameter("Город", "Москва");

    }



}
