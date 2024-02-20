package com.example.nnpia_cv_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServisController {

    ServisImpl servis = new ServisImpl();

    // http get - localhost:9000/servlet/servis/all
    @GetMapping ("/servis/all")
    public String getAllPeople(){
        return servis.toString();
    }

    // http get - localhost:9000/servlet/servis/1
    @GetMapping ("/servis/{param}")
    public String getByID(@PathVariable String param){
        return servis.getById(param);
    }
}
