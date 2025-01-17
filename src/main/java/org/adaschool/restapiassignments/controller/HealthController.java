package org.adaschool.restapiassignments.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public record HealthController() {

  @GetMapping
  public ResponseEntity<?> getHealthResponse(){
    return new ResponseEntity<String>("API working OK!", HttpStatus.OK);
  }

}
