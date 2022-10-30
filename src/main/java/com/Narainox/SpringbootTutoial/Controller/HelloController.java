package com.Narainox.SpringbootTutoial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@RequestMapping(value = "/",method = RequestMethod.GET)
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello Ayush Welcome to SpringBoot Workspace.";
    }
}
