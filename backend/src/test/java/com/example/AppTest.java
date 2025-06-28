package com.example;

import com.example.domain.EmailReplyData;
// import com.example.service.DataBaseQuery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest  // tells Spring to load the full application context
public class AppTest {

    // @Autowired
    // private DataBaseQuery dataBaseQuery;

    // @Test
    // public void insertTest() {
    //     EmailReplyData emailReplyData = dataBaseQuery.addData(
    //         new EmailReplyData(2, "hello Friends", "friendly", "hii buddy", null)
    //     );
    //     System.out.println(emailReplyData.getId() + " " + emailReplyData.getReply());
    // }

    // @Test   
    // public void allData() {
    //     dataBaseQuery.fetchAllData().forEach(data -> {
    //         System.out.println(data.getReply());
    //     });
    // }

    // @Test
    // public void fetchById() {
    //     EmailReplyData emailReplyData = dataBaseQuery.fetchById(1);
    //     System.out.println(emailReplyData.getContent());
    // }

    // @Test
    // public void deleteById(){
    //     dataBaseQuery.deleteData(1);
    // }
}
