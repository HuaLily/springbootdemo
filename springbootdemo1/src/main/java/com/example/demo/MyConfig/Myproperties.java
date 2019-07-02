package com.example.demo.MyConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties(prefix = "test")
@Component
public class Myproperties {

    @Value("${test.from}")
    String form;
    @Value("${test.to}")
    String to;

    @Override
    public String toString() {
        return "Myproperties{" +
                "form='" + form + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
