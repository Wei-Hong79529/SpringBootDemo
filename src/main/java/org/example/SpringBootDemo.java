package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootDemo extends SpringBootServletInitializer {
    //採用war檔佈署至外部Tomcat，在ServletInitializer 將SpringBootApplication 轉換成WebApps
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootDemo.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo.class,args);
    }
}
