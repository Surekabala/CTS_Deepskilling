package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4J {

    private static final Logger logger =
            LoggerFactory.getLogger(SLF4J.class);

    public static void main(String[] args) {

        logger.info("User logged in successfully");

        logger.warn("Password is weak");

        logger.error("Login failed");
    }
}