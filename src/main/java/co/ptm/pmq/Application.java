package co.ptm.pmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;


@EnableJms
@SpringBootApplication
public class Application {

    static final String qName = "DEV.QUEUE.1"; // A queue from the default MQ Developer container config

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
