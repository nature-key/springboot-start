package com.sptingboot.start;

import com.sptingboot.start.dao.UserDao;
import com.sptingboot.start.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.reactive.WebSocketReactiveAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = WebSocketReactiveAutoConfiguration.class)
public class StartApplication {
    //默认是info
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StartApplication.class, args);
        context.getBean(UserDao.class).log();
        System.out.println("=====================");
        context.getBean(UserService.class).log();

    }
}
