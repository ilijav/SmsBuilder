package com.ilija.smstest.model;

import java.util.ArrayList;
import java.util.List;

public class Message {

    private String from = "nameFrom";
    private static final String dcs = "8";
    private List<Number> to = new ArrayList<Number>();
    private Body body;

    public Message(String number, String text) {
        this.body = new Body(text);
        Number n = new Number(number);
        to.add(n);
    }

    public String getFrom() {
        return from;
    }

    public List<Number> getTo() {
        return to;
    }

    public Body getBody() {
        return body;
    }

    public String getDcs() {
        return dcs;
    }
}
