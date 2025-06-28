package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;

import com.example.domain.EmailReplyData;

@Service
public class DataBaseQuery {

    // @Autowired
    // private JdbcClient jdbcClient;

    // public EmailReplyData addData(EmailReplyData emailReplyData) {

    //     // String query = "Insert into EmailReply(content, tone, reply) values(?,?,?)";
    //     String query = "Insert into EmailReply(content, tone, reply) values(:content, :tone, :reply)";

    //     int update = jdbcClient.sql(query)
    //     // .param(1, emailReplyData.getContent())
    //     .param("content", emailReplyData.getContent())

    //     .param("tone", emailReplyData.getTone())
    //     .param("reply", emailReplyData.getReply())
    //     .update();

    //     System.out.println("Data Added: "+ update);

    //     return emailReplyData;

    // }

    // public List<EmailReplyData> fetchAllData(){
    //     List<EmailReplyData> data = jdbcClient.sql("select * from EmailReply").query(EmailReplyData.class).list();
    //     return data;
    // }

    // public EmailReplyData fetchById(int id) {
    //     EmailReplyData data = jdbcClient.sql("select * from EmailReply where id = :id").param("id", id).query(EmailReplyData.class).single();
    //     return data;
    // }

    // public void updateData(int id) {
    //     return;
    // }

    // public void deleteData(int id) {
    //     jdbcClient.sql("delete from EmailReply where id = :id")
    //     .param("id", id)
    //     .update();
    // }
    
}
