package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RestController
@RequiredArgsConstructor
public class TestController {

  private final TestService testService;

  @RequestMapping("test/test")
  public String hope() {
    return testService.test();
  }
}
