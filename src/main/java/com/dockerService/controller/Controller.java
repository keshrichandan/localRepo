package com.dockerService.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")

public class Controller {
        int count = 0;
    @GetMapping("/hello")
        public ResponseEntity<String> getMethod() {
                count++;
                log.info("inside the get method hit count is: {}", count);

            return new ResponseEntity<>("welcome to the docker world!", HttpStatus.OK);
        }
    }

