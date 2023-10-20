package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import pages.*;
import pages.components.AttachmentFile;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class TestBase {

    MainPage mainPage = new MainPage();
    CatalogPage catalogPage = new CatalogPage();

    BasketPage basketPage = new BasketPage();


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.wildberries.ru/";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
        Configuration.pageLoadStrategy = "eager";

        Configuration.remote = System.getProperty("remoteUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));


        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addArtefactsToReport() {
        AttachmentFile.screenshot("Screenshot");
        AttachmentFile.pageSource();
        AttachmentFile.consoleLogs();
        AttachmentFile.video();
    }
}
