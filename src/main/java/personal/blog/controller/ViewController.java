package personal.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/login")
    public String hello(){
        return "login";
    }

    @GetMapping("/")
    public String root(){
        return "article";
    }

    @GetMapping("/articles")
    public String articles(){
        return "article";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

}
