package com.example.apiclient.application.controllers;

import com.example.apiclient.domain.data.message.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api-client")
public class ClientController {

  private final Logger logger = LoggerFactory.getLogger(ClientController.class);

  @RequestMapping
  public ResponseEntity<Response> get() {
    logger.info("LOG -> Retornando os dados do client");
    return ResponseEntity.ok(new Response("Retornando os dados do client"));
  }

}
