package ru.psb.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/remote.properties"
})
public interface ProjectConfig extends Config {

    @DefaultValue("chrome")
    @Key("browser")
    String browser();

    @DefaultValue("91.0")
    @Key("browserVersion")
    String browserVersion();

    @DefaultValue("https://www.psbank.ru/")
    @Key("baseUrl")
    String baseUrl();

    @DefaultValue("1920x1080")
    @Key("browserSize")
    String browserSize();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

    @Key("videoStorage")
    String videoStorage();
}
