package com.FromLecture;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.annotation.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LabelsTest {


   @Test
   @Owner("starostinSA")
   @Severity(SeverityLevel.BLOCKER)
   @Feature("Задачи в репозитории")
   @Story("Просматр созданных задач в репозитории")
   @DisplayName("Мой любимый хряк")
   @Link(value = "Гестинг", url = "https://github.com")
    public void testAnnotated() {

    }

    @Test
    public void testCode() {
        Allure.label("owner", "starostinSA");
        Allure.label("severity", SeverityLevel.CRITICAL.value());
        Allure.feature("Задачи в репозитории");
        Allure.story("Просматр созданных задач в репозитории");
        Allure.link("Тестинг", "https://github.com");
    }
    @Documented
    @Owner("starostinSA")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Задачи в репозитории")
    @Story("Просматр созданных задач в репозитории")
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface IssueShow {

    }

}
