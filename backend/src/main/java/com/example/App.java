package com.example;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(exclude = {
    // JdbcTemplateAutoConfiguration.class,
    // DataSourceAutoConfiguration.class
})

public class App implements CommandLineRunner{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main( String[] args ){
       SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from emailReply");
        // System.out.println(queryForList.size());
        
        // queryForList.forEach((item) -> {
        //     System.out.println("id: " + item.get("id"));
        //     System.out.println("content: " + item.get("content"));
        //     System.out.println("tone: " + item.get("tone"));
        //     System.out.println("reply: " + item.get("reply"));
        //     System.out.println("_____________________________");
        // });

    }
    

}
