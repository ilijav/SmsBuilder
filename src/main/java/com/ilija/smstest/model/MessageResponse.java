package com.ilija.smstest.model;

public class MessageResponse {

    private String to;
    private String status;
    private String reference;
    private Integer parts;
    private String messageDetails;
    private String messageErrorCode;

    public MessageResponse(String to, String status, String reference, Integer parts, String messageDetails, String messageErrorCode) {
        this.to = to;
        this.status = status;
        this.reference = reference;
        this.parts = parts;
        this.messageDetails = messageDetails;
        this.messageErrorCode = messageErrorCode;
    }

    public String getTo() {
        return to;
    }

    public String getStatus() {
        return status;
    }

    public String getReference() {
        return reference;
    }

    public Integer getParts() {
        return parts;
    }

    public String getMessageDetails() {
        return messageDetails;
    }

    public String getMessageErrorCode() {
        return messageErrorCode;
    }
}
