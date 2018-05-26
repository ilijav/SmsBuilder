package com.ilija.smstest.model;

import java.util.LinkedList;
import java.util.List;

public class Messages {

    private Authentication authentication = new Authentication();

    private List<Message> msg = new LinkedList<Message>();

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public List<Message> getMsg() {
        return msg;
    }
}
