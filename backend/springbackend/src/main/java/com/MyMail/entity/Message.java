package com.MyMail.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
public class Message {
    private String title;
    private boolean important = false;
    private String sender;
    private String senderMail;
    private Date date;
}
