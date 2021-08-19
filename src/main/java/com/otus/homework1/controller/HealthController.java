package com.otus.homework1.controller;

import com.otus.homework1.controller.dto.HeathResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health12")
@CrossOrigin
@Slf4j
public class HealthController {

    @GetMapping
    public HeathResponse checkHealth() {
        log.info("LLLLLLogggssss");
        return new HeathResponse("LALAL");
    }
}
