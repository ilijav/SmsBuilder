package com.ilija.smstest.model;

public class SmsRequestBuilder {

    public static SmsRequestBuilder newBuilder() {
        return new SmsRequestBuilder();
    }

    private SmsRequest instance;

    private SmsRequestBuilder() {
        instance = new SmsRequest();
    }

    public SmsRequest build() {
        return instance;
    }

    public SmsRequestBuilder addMessage(String number, String text) {
        // todo set text
        Message m = new Message(number, text);
        instance.getMessages().getMsg().add(m);
        return this;
    }
}
