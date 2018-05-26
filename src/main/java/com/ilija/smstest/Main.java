package com.ilija.smstest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ilija.smstest.model.SmsRequest;
import com.ilija.smstest.model.SmsRequestBuilder;

import java.io.IOException;

public class Main {

    public static void main(String... args) throws JsonProcessingException, IOException {

        Logger.log("Test");

        SmsRequest smsRequest = SmsRequestBuilder.newBuilder()
                .addMessage("1111111", "text")
                .build();

        ObjectMapper objectMapper = new ObjectMapper();
        Logger.log(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smsRequest));

        String response = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smsRequest);
        Logger.log("RESPONSE:");
        Logger.log(response);

        SmsRequest smsResponse = objectMapper.readValue(response, SmsRequest.class);

        Logger.log("After convert:");
        Logger.log("Details: " + smsResponse.getMessages().getMsg());
    }

}
