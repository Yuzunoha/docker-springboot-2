package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

  public String hello() {
    return "hello!こんにちは。ここはHelloService::hello()です。";
  }

  public String test() {
    return "hello!こんにちは。ここはHelloService::test()です。";
  }
}
