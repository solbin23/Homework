package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {

    @RequestMapping(value = "/")
    public String Homework(){
        String str = "hello world!";
        System.out.println("hello world!");
        return str;
    }
}
