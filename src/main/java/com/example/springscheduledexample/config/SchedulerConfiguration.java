package com.example.springscheduledexample.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class SchedulerConfiguration {

    @Scheduled(cron = "*/5 * * * * ?")
    public void run() {
        log.info("Scheduler is running");
    }

}
