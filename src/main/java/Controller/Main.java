package Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    @RequestMapping(value = "/")
    public ModelAndView hello(){
        String  msg = "hello world!";
        System.out.println(msg);
        return new ModelAndView("/hello","msg",msg);
    }
}
