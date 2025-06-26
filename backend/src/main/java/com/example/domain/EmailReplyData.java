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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

     public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }


}
