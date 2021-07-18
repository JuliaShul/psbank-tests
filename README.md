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

:heavy_check_mark: - Проверка поиска позиции

:heavy_check_mark: - Проверка категорий на главной странице

:heavy_check_mark: - Проверка разделов на главной странице

:heavy_check_mark: - Проверка заголовка на главной странице

:heavy_check_mark: - Проверка автоматически выбранного региона на главной странице

:heavy_check_mark: - Проверка наименования продукта

:heavy_check_mark: - Проверка наличия кнопки 'Добавить в корзину'

:heavy_check_mark: - Проверка наличия ссылки 'Перейти к описанию'

:heavy_check_mark: - Проверка наличия комплектации продукта

:heavy_check_mark: - Проверка наличия описания продукта

:heavy_check_mark: - Проверка наличия информации о бренде продукта

:heavy_check_mark: - Проверка наличия информации о технологии матрицы

:heavy_check_mark: - Проверка наличия информации о коде продукта

:heavy_check_mark: - Проверка наличия информации о функции камеры продукта

:heavy_check_mark: - Проверка наличия информации о разрешении основной камеры

:heavy_check_mark: - Проверка наличия информации об оперативной памяти

:heavy_check_mark: - Проверка наличия информации о весе продукта

:heavy_check_mark: - Проверка наличия информации о разрешении экрана

:heavy_check_mark: - Проверка наличия информации о версии продукта

:heavy_check_mark: - Проверка наличия информации о диогонале

:heavy_check_mark: - Проверка наличия информации о разрешении основной процессоре

:heavy_check_mark: - Проверка наличия информации о гарантии продукта

:heavy_check_mark: - Проверка наличия информации о размере продукта

:heavy_check_mark: - Проверка наличия информации об оперативной памяти

:heavy_check_mark: - Проверка наличия информации об основном материале

### API:

:heavy_check_mark: - Проверка получения информации о водке

:heavy_check_mark: - Проверка получения информации о броши

:heavy_check_mark: - Проверка получения информации о гвоздях

:heavy_check_mark: - Проверка получения информации о принтере

:heavy_check_mark: - Проверка получения информации о программе

:heavy_check_mark: - Проверка получения информации о беговой дорожке

:heavy_check_mark: - Проверка получения информации о пылесосах
<br><br>
## Команды для запуска тестов из терминала
Для локального запуска тестов необходимо задать параметры в `local.driver.properies`
```
gradle clean test
```
Для запуска тестов в несколько потоков необходимо в атрибуте `Dthreads` передать число, равное желаемому количеству потоков
```
gradle clean test -Dthreads=3
```
<br><br>
## Видео прохождения одного из тестов
![Selenoid](src/test/resources/files/test_run.gif)
<br><br>

## В качестве CI системы был использован Jenkins
[Ссылка на джобу в Jenkins](https://jenkins.autotests.cloud/job/c05-ebogdanovaa-graduationProject/)
### Статистика по последним пяти запускам тестов
![Jenkins](src/test/resources/files/Jenkins.jpg)
<br><br>

### Указание параметров для запуска тестов
![Jenkins](src/test/resources/files/Jenkins1.jpg)
<br><br>

## В качестве системы Тест Менеджмента был использован Allure TestOps
### Основной дашборд для отслеживания
![Allure_MainDashboard](src/test/resources/files/Allure_dashboars1.jpg)
<br><br>

### Дашборд по разным типам тестов
![Allure_Tests](src/test/resources/files/Allure_dashboars2.jpg)
<br><br>

### Дашборд по разным стадиям
![Allure_StageDashboard](src/test/resources/files/Allure_dashboars3.jpg)
<br><br>

### Дашборд по участникам команды
![Allure_TeamDashboard](src/test/resources/files/Allure_dashboars4.jpg)
<br><br>

### Пример ручного теста
![Allure_ManualTest](src/test/resources/files/Allure_dashboars5.jpg)
<br><br>

### Пример автоматизированного теста
![Allure_AutomationTest](src/test/resources/files/Allure_dashboars6.jpg)
<br><br>

### Страница запуска тестов
![Allure_Launch](src/test/resources/files/Allure_dashboars7.jpg)
<br><br>

### Отчет по конкретному запуску
![Allure_Launch72](src/test/resources/files/Allure_dashboars8.jpg)
<br><br>

## В качестве багтрекера использовалась Jira, у которой была настроена интеграция с Allure TestOps
### Пример инцидента на регресс с привязкой тест-кейсов и запуском тестов
![Allure_Jira](src/test/resources/files/JIRA.jpg)
<br><br>

## Для отправки нотификаций был выбран Telegram
![Allure_Telega](src/test/resources/files/Notifications.gif)
### Пример нотификации с результатом прохождения тестов

![Allure_Telega2](src/test/resources/files/Notifications.jpg)

