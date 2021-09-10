# Автотесты на https://www.psbank.ru/

## Technology Stack
| Java | Gradle | Junit5 | Selenide | GitHub | IntelliJ IDEA |
|:------:|:----:|:----:|:------:|:------:|:--------:|
| <img src="images/JAVA.svg" width="40" height="40"> | <img src="images/Gradle.svg" width="40" height="40"> | <img src="images/Junit5.svg" width="40" height="40"> | <img src="images/Selenide.svg" width="40" height="40"> |<img src="images/GitHub.svg" width="40" height="40"> | <img src="images/IDEA.svg" width="40" height="40"> |

| Jenkins | Selenoid | Allure Report | Allure TestOps | Telegram |
|:--------:|:-------------:|:---------:|:-------:|:--------:|
| <img src="images/Jenkins.svg" width="40" height="40"> | <img src="images/Selenoid.svg" width="40" height="40"> | <img src="images/Allure Report.svg" width="40" height="40"> | <img src="images/Allure TestOps.svg" width="40" height="40"> | <img src="images/Telegram.svg" width="40" height="40"> |


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

