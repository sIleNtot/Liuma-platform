package com.autotest.LiuMa.job;

import com.autotest.LiuMa.service.ScheduleJobService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Component
public class EngineScheduleJob {

    @Resource
    ScheduleJobService scheduleJobService;

    @Scheduled(cron = "0 0/1 * * * ?") // 每分钟执行一次
    public void updateLostHeartbeatEngine(){
        scheduleJobService.updateLostHeartbeatEngine();
    }
}
