package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
  private class Inner {
    private String s = "";

    public void add(String line) {
      this.s += line + '\n';
    }

    public String get() {
      return this.s;
    }
  }

  public String test() {
    int n = 2;
    n--;
    var s = switch (n) {
      case 0 -> "0です";
      case 1 -> "1です";
      default -> "想定外の数値です";
    };
    return s;
  }
}
