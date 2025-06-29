package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {
    // Create the Logger instance
    private static final Logger logger = LoggerFactory.getLogger(com.example.LoggerDemo.class);

    public static void main(String[] args) {
        // Log an error-level message
        logger.error("This is an error message");

        // Log a warning-level message
        logger.warn("This is a warning message");
    }
}
