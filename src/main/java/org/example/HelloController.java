package org.example;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
//@Api(value = "Hello Controller", description = "APIs for saying hello")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "<html><body><h1>Hello from Spring!</h1></body></html>";
    }
}