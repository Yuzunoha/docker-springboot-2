package com.example.demo.controller;

import com.example.demo.service.HopeService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HopeController {

  private final HopeService hopeService;

  @RequestMapping("hope/hope")
  public String hope() {
    return hopeService.hope();
  }
}
