package com.itont.multidevice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 系统配置
 * @author: cuihd
 * @date: 2018-12-13 15:12
 **/
@Configuration
@ConfigurationProperties(value = "system")
public class SystemConfig {

    public String defaultSite;

    public String mobileSite;

    public String getDefaultSite() {
        return defaultSite;
    }

    public void setDefaultSite(String defaultSite) {
        this.defaultSite = defaultSite;
    }

    public String getMobileSite() {
        return mobileSite;
    }

    public void setMobileSite(String mobileSite) {
        this.mobileSite = mobileSite;
    }
}
