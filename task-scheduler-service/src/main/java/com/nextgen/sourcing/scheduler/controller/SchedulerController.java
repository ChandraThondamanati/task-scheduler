package com.nextgen.sourcing.scheduler.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("/scheduler")
@AllArgsConstructor
public class SchedulerController {

    @GetMapping("/{serviceName}/status")
    public ResponseEntity<String> getStatus(@PathVariable String serviceName){

        return new ResponseEntity<>("Successfully got the status of sandeep.",HttpStatus.OK );

    }
}
