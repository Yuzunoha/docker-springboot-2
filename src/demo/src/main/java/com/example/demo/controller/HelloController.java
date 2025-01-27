package com.example.demo.controller;

import com.example.demo.service.HelloService;
import com.example.demo.service.TimeService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

  private final HelloService helloService;
  private final TimeService timeService;

  @RequestMapping({ "/", "hello" })
  public String hello() {
    return helloService.hello();
  }

  @RequestMapping("test")
  public String test() {
    return helloService.test();
  }

  @RequestMapping("time")
  public String time() {
    return timeService.time();
  }
}
