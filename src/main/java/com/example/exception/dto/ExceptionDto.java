package com.example.exception.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tada on 2015/10/12.
 */
public class ExceptionDto {

    @JsonProperty("error_type")
    private String errorType;
    private String[] messages;

    public ExceptionDto(String errorType, String... messages) {
        this.errorType = errorType;
        this.messages = messages;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String[] getMessages() {
        return messages;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }
}
