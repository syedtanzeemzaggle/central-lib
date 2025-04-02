package org.zaggle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public final class TestController {

    @GetMapping("/health")
    public String health() {
        return "up and running";
    }
}
