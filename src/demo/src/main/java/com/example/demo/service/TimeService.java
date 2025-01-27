package com.example.demo.service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class TimeService {

  public String time() {
    // タイムゾーン指定のオブジェクトを生成する
    ZonedDateTime jstZonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

    // "2025/01/27 19:49:38 JST" の形に変換する
    String s = jstZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")) + " JST";

    // 返却する
    return s;
  }
}
