package com.hllinc.testelk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author hongliang
 * @version 1.0
 * @date 2022/7/25 11:40
 */
@Slf4j
@RestController
public class TestLogs {
  @GetMapping("/logs")
  public String printLogs() {
    log.info(this.getClass().getSimpleName() + " info : " + LocalDateTime.now().getSecond());
    log.warn(this.getClass().getSimpleName() + " warn : " + LocalDateTime.now().getSecond());
    log.error(this.getClass().getSimpleName() + " error : " + LocalDateTime.now().getSecond());
    return "logs";
  }
}
