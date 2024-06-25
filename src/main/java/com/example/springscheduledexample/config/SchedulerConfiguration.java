package com.example.springscheduledexample.config;

import com.example.springscheduledexample.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class SchedulerConfiguration {

    private final TestService testService;

    @Scheduled(cron = "*/5 * * * * ?")
    public void run() {
        testService.testMethod();
    }

}
