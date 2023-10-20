package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class MainPage {
    SelenideElement header = $(".header__top"),
            supportChat = $(".smm-fixed__toggle[aria-label='Онлайн чат']"),
            supportChatHeader = $(".chat__text"),
            searchInput = $("#searchInput");


    public MainPage openPage() {
        open("/");

        return this;
    }

    public MainPage checkTitle(String value) {
        header.shouldHave(text(value));

        return this;
    }

    public MainPage openSupportChat() {
        supportChat.click();

        return this;
    }

    public MainPage checkSupportChat(String value) {
        supportChatHeader.shouldHave(text(value));

        return this;
    }

    public MainPage activeSearchInput() {
        searchInput.click();

        return this;
    }

    public MainPage choiceProduct(String value) {
        searchInput.setValue(value).pressEnter();


        return this;
    }
}
