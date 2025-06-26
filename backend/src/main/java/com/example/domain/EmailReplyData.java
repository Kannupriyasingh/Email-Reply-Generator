package com.example.domain;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class EmailReplyData {
    private int id;
    private String content;
    private String tone;
    private String reply;
    private Timestamp time;


    public EmailReplyData(int id, String content, String tone, String reply, Timestamp time){
        this.id = id;
        this.content = content;
        this.tone = tone;
        this.reply = reply;
        this.time = time;
    }

    public EmailReplyData(){
        
    }

}
