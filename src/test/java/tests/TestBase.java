package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import pages.*;
import pages.components.AttachmentFile;

import config.ConfigReader;
import config.WebDriverConfig;
import config.WebDriverProvider;

public class TestBase {

    private static final WebDriverConfig config = ConfigReader.Instance.read();

    MainPage mainPage = new MainPage();
    CatalogPage catalogPage = new CatalogPage();
    BasketPage basketPage = new BasketPage();


    @BeforeAll
    public static void beforeAll() {
        WebDriverProvider webDriverProvider = new WebDriverProvider(config);
        webDriverProvider.webDriverConfig();

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
