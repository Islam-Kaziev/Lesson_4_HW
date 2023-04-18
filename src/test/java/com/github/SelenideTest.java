package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
    @Test
        void checkingVisibleCode() {
            open("https://github.com/selenide/selenide");
            $("#wiki-tab").click();
            $x("//a[text()='Soft assertions']").should(visible).click();
            $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("Using JUnit5"));
    }
}
