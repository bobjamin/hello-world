package com.main;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
public class Main {

    @Value("${hello-from}")
    String helloFrom;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World from " + helloFrom + "!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}