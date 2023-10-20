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
<img width="6%" title="IntelliJ IDEA" src="img/Intelij_IDEA.svg">
<img width="6%" title="Java" src="img/Java.svg">
<img width="6%" title="Selenide" src="img/Selenide.svg">
<img width="6%" title="Selenoid" src="img/Selenoid.svg">
<img width="6%" title="Allure Report" src="img/Allure_Report.svg">
<img width="6%" title="Gradle" src="img/Gradle.svg">
<img width="6%" title="JUnit5" src="img/JUnit5.svg">
<img width="6%" title="GitHub" src="img/GitHub.svg">
<img width="6%" title="Jenkins" src="img/Jenkins.svg">
<img width="6%" title="Telegram" src="img/Telegram.svg">

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
- REMOTE_URL- адрес удаленного сервера, на котором будут запускаться тесты,
- BROWSER - выбранный браузер,
- BROWSER_VERSION - версия выбранного браузера,
- BROWSER_SIZE - размер открываемого окна браузера, в котором будут выполняться тесты

### Сборка в Jenkins
<kbd> ![image](https://github.com/nice58/project/assets/103956147/cea91215-d48b-476f-8a1a-ee780dca6db0)</kbd>

### Пример Allure-отчета
<kbd>![Screenshot_193](https://github.com/nice58/project/assets/103956147/4a2cc9d0-e9c5-4030-8ee5-6f36102ee604)</kbd>

### Уведомление в Telegram о результатах прохождения тестов
<kbd>![image](https://github.com/nice58/project/assets/103956147/70928dce-b714-474c-951e-3a9884c7ffea)</kbd>

### Видеопример прохождения тестов
https://github.com/nice58/project/assets/103956147/725b0336-5c4e-4e1e-b3b9-1c05c631c49f

















