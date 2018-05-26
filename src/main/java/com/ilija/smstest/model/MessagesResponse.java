package com.ilija.smstest.model;

import java.util.LinkedList;
import java.util.List;

public class MessagesResponse {

    private List<MessageResponse> msg = new LinkedList<MessageResponse>();

    public List<MessageResponse> getMsg() {
        return msg;
    }
}
