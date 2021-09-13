# Autotests for https://www.psbank.ru/

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

:heavy_check_mark: - Проверка разделов на главной странице

:heavy_check_mark: - Проверка категорий на главной странице

## Default settings used [for Jenkins startup](https://jenkins.autotests.cloud/job/reports_psb_tests/) <a href="https://www.jenkins.io/"><img src="./images/Jenkins.svg" width="40" height="40"  alt="Jenkins"/></a>

### Specifying parameters for running tests
* BROWSER (default chrome)
* BROWSER_VERSION (default 91.0)
* BROWSER_SIZE (default 1920x1080)
* BROWSER_MOBILE
* REMOTE_DRIVER_URL (url address from selenoid or grid. default selenoid.autotests.cloud)
* THREADS (number of threads to run. default 1)
* ALLURE_NOTIFICATIONS_VERSION (default 3.1.1)

![Jenkins](src/test/resources/files/Jenkins.jpg)
<br><br>

### Run tests with not filled local.properties:

```bash
gradle clean test -Dbrowser=chrome -DbrowserVersion=91.0 -DbrowserSize=1920x1080 -DbrowserMobileView= -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/
```
### Serve allure report:

```bash
allure serve build/allure-results
```

## Test Management system was used Allure 
<!-- ### List of tests in Allure TestOps
![alt "Allure TestOps"](src/test/resources/files/ListOfTestsInAllureTestOps.png "Allure TestOps") -->

### Analysis of results in Jenkins via Allure Reports<a href="https://qameta.io/"><img src="images/jenkins_allure.svg" width="40" height="40"></a>
![Allure_MainDashboard](src/test/resources/files/Allure_dashboars1.jpg)
<br><br>

<!-- ## Analysis of results in Allure TestOps <a href="https://qameta.io/"><img src="images/Allure_EE.svg" width="40" height="40"></a>
![alt "Allure TestOps"](src/test/resources/files/images/allure1.png "Allure TestOps") -->



--------------------------------------------------------------------------

## Notification of test results via a bot on Telegram <a href="https://telegram.org/"> <img src="images/telegram2.svg" width="40" height="40"></a>
![Allure_Telega](src/test/resources/files/Notifications.gif)

### Пример нотификации с результатом прохождения тестов
![Allure_Telega2](src/test/resources/files/Notifications.jpg)

## Video of the test run, taken from the Selenoid runtime environment <a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="40" height="40"></a>
## Видео прохождения одного из тестов
![Selenoid](src/test/resources/files/test_run.gif)
<br><br>

