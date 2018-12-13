package com.itont.multidevice.controller;

import com.itont.multidevice.config.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: cuihd
 * @date: 2018-12-12 19:20
 **/
@Controller
public class HomeController {

    @Autowired
    private SystemConfig systemConfig;

    @RequestMapping("/")
    public String index(Device device) {
        //根据客户端不同设备定向到不同的页面或站点
        if (device.isMobile() || device.isTablet()) {
            return systemConfig.getMobileSite();//mobile
        }
        return systemConfig.getDefaultSite();//default
    }
}
