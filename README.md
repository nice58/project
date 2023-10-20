# Автоматизация сайта Wildberries
![wb](https://github.com/nice58/project/assets/103956147/dde0288b-cfcb-4c76-bb9d-ef1d6d61558b)
## Содержание:
- Стек технологий
- Реализованные проверки
- Команды запуска автотестов
- Сборка в Jenkins
- Пример Allure-отчета
- Уведомление в Telegram о результатах прохождения тестов
- Видеопример прохождения тестов
### Стек технологий
<img width="6%" title="IntelliJ IDEA" src="media/Intelij_IDEA.svg">
<img width="6%" title="Java" src="media/Java.svg">
<img width="6%" title="Selenide" src="media/Selenide.svg">
<img width="6%" title="Selenoid" src="media/Selenoid.svg">
<img width="6%" title="Allure Report" src="media/Allure_Report.svg">
<img width="5%" title="Allure TestOps" src="media/AllureTestOps.svg">
<img width="6%" title="Gradle" src="media/Gradle.svg">
<img width="6%" title="JUnit5" src="media/JUnit5.svg">
<img width="6%" title="GitHub" src="media/GitHub.svg">
<img width="6%" title="Jenkins" src="media/Jenkins.svg">
<img width="6%" title="Telegram" src="media/Telegram.svg">
<img width="5%" title="Jira" src="media/Jira.svg">
### Реализованные проверки
- Корректность открытия главной страницы
- Открытие чата с поддержкой
- Выполнение поиска товара через строку поиска на главной странице
- Добавление товара в корзину
- Удаление товара из корзины
### Запуск автотестов
Команда запуска тестов из терминала
```bash
gradle clean test
```
Параметры запуска в Jenkins
```bash
clean
test
-DremoteUrl=${REMOTE_URL}
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
```
, где
REMOTE_URL- адрес удаленного сервера, на котором будут запускаться тесты,
BROWSER - выбранный браузер,
BROWSER_VERSION - версия выбранного браузера,
BROWSER_SIZE - размер открываемого окна браузера, в котором будут выполняться тесты
### Сборка в Jenkins
![Screenshot_192](https://github.com/nice58/project/assets/103956147/f311c4fd-12fa-4990-82de-ef7cad4ac337)
### Пример Allure-отчета
![Screenshot_193](https://github.com/nice58/project/assets/103956147/4a2cc9d0-e9c5-4030-8ee5-6f36102ee604)
### Уведомление в Telegram о результатах прохождения тестов
![image](https://github.com/nice58/project/assets/103956147/70928dce-b714-474c-951e-3a9884c7ffea)
### Видеопример прохождения тестов
https://github.com/nice58/project/assets/103956147/725b0336-5c4e-4e1e-b3b9-1c05c631c49f

















