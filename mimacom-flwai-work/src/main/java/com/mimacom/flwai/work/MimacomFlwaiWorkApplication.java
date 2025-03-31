package com.mimacom.flwai.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;

@SpringBootApplication(exclude = {FreeMarkerAutoConfiguration.class})
public class MimacomFlwaiWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(MimacomFlwaiWorkApplication.class, args);
    }
}
