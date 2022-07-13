package com.FromLecture;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
    }

   @Test
    public void testGitHubIssue() {
       SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");

       $(".header-search-input").click();
       $(".header-search-input").sendKeys("eroshenkoam/allure-example");
       $(".header-search-input").submit();

       $(By.linkText("eroshenkoam/allure-example")).click();
       //$(".js-repo-nav").shouldBe(Condition.visible);
       $(By.partialLinkText("Issues")).click();
       $("#issue_76_link").click();
       //$(withText("#76")).click();
    }
}
