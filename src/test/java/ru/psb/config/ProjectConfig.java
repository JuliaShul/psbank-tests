package ru.psb.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local_driver.properties",
        "classpath:config/remote_driver.properties"
})
public interface ProjectConfig extends Config {

    String browser();

    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

    @Key("videoStorage")
    String videoStorage();

    @Key("webRemoteDriverUser")
    String webRemoteDriverUser();

    @Key("webRemoteDriverPassword")
    String webRemoteDriverPassword();
}
