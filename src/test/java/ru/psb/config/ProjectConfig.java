package ru.psb.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local_driver.properties",
        "classpath:config/remote_driver.properties"
})
public interface ProjectConfig extends Config {

    @Key("browser")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

    @Key("videoStorage")
    String videoStorage();

    @Key("browserMobileView")
    String webBrowserMobileView();

    @Key("web.remote.driver.user")
    String webRemoteDriverUser();

    @Key("web.remote.driver.password")
    String webRemoteDriverPassword();
}
