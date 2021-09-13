# Автотесты на https://www.psbank.ru/

## Technology Stack
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Intelij_IDEA.svg" width="40" height="40"  alt="IDEA"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="40" height="40"  alt="Java"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="40" height="40"  alt="Gradle"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="40" height="40"  alt="JUnit 5"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Rest-Assured.svg" width="40" height="40"  alt="ResrAssured"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg" width="40" height="40"  alt="Seleide"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg" width="40" height="40"  alt="Jenkins"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg" width="40" height="40"  alt="Selenoid"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Github.svg" width="40" height="40"  alt="Github"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="40" height="40"  alt="Allure TestOps"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Jira.svg" width="40" height="40"  alt="Jira"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width="40" height="40"  alt="Telegram"/>
</a>

IntelliJ IDEA, Java, Gradle, JUnit5, Rest-Assured, Selenide, Jenkins, Selenoid, Github, Allure TestOps, Jira, Telegram (notifications)
<br><br>

## Были реализованы следующие проверки:
### UI:

:heavy_check_mark: - Проверка заголовка на главной странице

:heavy_check_mark: - Проверка разделов на главной странице

:heavy_check_mark: - Проверка категорий на главной странице

:heavy_check_mark: - Проверка автоматически выбранного региона на главной странице


<br><br>
## Команды для запуска тестов из терминала
Для локального запуска тестов необходимо задать параметры в `local.driver.properies`
```
gradle clean test
```

<br><br>
## Видео прохождения одного из тестов
![Selenoid](src/test/resources/files/test_run.gif)
<br><br>

## В качестве CI системы был использован Jenkins
[Ссылка на джобу в Jenkins](https://jenkins.autotests.cloud/job/reports_for_psbank/)

### Указание параметров для запуска тестов
![Jenkins](src/test/resources/files/Jenkins.jpg)
<br><br>

## В качестве системы Тест Менеджмента был использован Allure TestOps
### Основной дашборд для отслеживания
![Allure_MainDashboard](src/test/resources/files/Allure_dashboars1.jpg)
<br><br>

## Для отправки нотификаций был выбран Telegram
![Allure_Telega](src/test/resources/files/Notifications.gif)

### Пример нотификации с результатом прохождения тестов
![Allure_Telega2](src/test/resources/files/Notifications.jpg)

