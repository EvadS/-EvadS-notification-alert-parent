package com.se.sample;

import com.se.service.notification.controller.HomeController;
import com.se.service.notification.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class NotificationParentApplication  implements CommandLineRunner  {



    @Autowired



    public static void main(String[] args) {
        SpringApplication.run(NotificationParentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        HomeController homeController = new HomeController();

        System.out.println(" homeController: " + homeController.greeting());


    }
}
