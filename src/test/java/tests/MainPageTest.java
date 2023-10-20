package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class MainPageTest extends TestBase {

    @DisplayName("Проверка открытия главной страницы")
    @Test
    void checkCorrectPage() {

        step("Открыть Главную Страницу", () -> {
            mainPage.openPage();
        });

        step("Проверить заголовок на странице", () -> {
            mainPage.checkTitle("Продавайте на Wildberries");

        });
    }

    @DisplayName("Проверка открытия чата поддержки")
    @Test
    void checkSupportWindow() {
        step("Открыть чат поддержки", () -> {
            mainPage.openPage();
            mainPage.openSupportChat();
        });

        step("Проверить заголовок в окне чата", () -> {
            mainPage.checkSupportChat("Поддержка Wildberries");

        });
    }
}
