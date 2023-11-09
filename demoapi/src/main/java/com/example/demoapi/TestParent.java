package com.example.demoapi;

//import java.util.ArrayList;
//import java.util.List;  
//import org.springframework.beans.factory.annotation.Autowired;  
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
@RestController  
public class TestParent {
    @RequestMapping("/testparent")
    public String sayHello(){
        return "Hey";
    }
    
}
