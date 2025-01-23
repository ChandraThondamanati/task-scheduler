package com.nextgen.sourcing.scheduler.configuration;

import com.nextgen.sourcing.scheduler.controller.SchedulerController;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class TaskSchedulerServiceAutoConfiguration {

    @Bean
    public SchedulerController schedulerController() {
        return new SchedulerController();
    }
}
