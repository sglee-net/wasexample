package com.vcanus.wasexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.vcanus.wasexample"
})
public class Application {
    private static final Logger logger =
            LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        // run spring boot
        ApplicationContext context = SpringApplication
                .run(Application.class,args);

        /**
         * CommandLineRunnerJettyWEbSocketServer
         *
         * CommandLineRunnerThriftServer
         *
         * CommandLineMessageQueue
         */
    }
}
