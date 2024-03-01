package com.example.apiclient.domain.data.message;

public class Response {

  private String message;

  public Response(final String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(final String message) {
    this.message = message;
  }
}
