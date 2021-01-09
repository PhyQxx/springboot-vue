package com.phy.px.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.主要用于标记配置类，兼备Component的效果。
 * @author PHY
 */
@Configuration
/**
 * 2.开启定时任务
 */
@EnableScheduling
public class SaticScheduleTask {


    /**
     * 3.添加定时任务
     * 或直接指定时间间隔，例如：5秒
     */
    @Scheduled(fixedRate = 120000)

    private void configureTasks() {
        Map<String, Object> map = new HashMap<>();
        System.err.println( "执行定时任务：" + LocalDateTime.now());
    }
}