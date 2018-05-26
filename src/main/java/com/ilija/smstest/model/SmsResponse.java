package com.ilija.smstest.model;

import java.util.LinkedList;
import java.util.List;

public class SmsResponse {

    private String details;
    private Integer errorCode;

    private List<MessagesResponse> messages = new LinkedList<MessagesResponse>();

    SmsResponse() {
    }

    public String getDetails() {
        return details;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public List<MessagesResponse> getMessages() {
        return messages;
    }
}
