package com.logger.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/logger")
class LoggerController {

    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @GetMapping("/log")
    public String logExample() {
        logger.trace("This is a trace message.");
        logger.debug("This is a debug message.");
        logger.info("This is an info message.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
        return "Logging example executed. Check the logs!";
    }
}