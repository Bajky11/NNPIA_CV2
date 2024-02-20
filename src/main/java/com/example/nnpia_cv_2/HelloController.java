package com.example.nnpia_cv_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
1.
@Controller se používá pro vytváření webových stránek a renderuje HTML.
@RestController se používá pro vytváření RESTful API a automaticky serializuje výsledky metod na formát JSON nebo XML.

2.
YAML je formát s důrazem na odsazení, je velmi jednoduchý.
JSON je formát založený na párech "klíč-hodnota" a je často používán pro výměnu dat mezi klientem a serverem.
XML používá hierarchickou strukturu značek a je používán se pro ukládání a výměnu dat mezi systémy.
*/
@RestController
public class HelloController {

    // http get - localhost:9000/servlet
    @GetMapping("")
    public String helloWorld() {
        return "Hello world from Spring Boot application.";
    }

    // http get - localhost:9000/servlet/echo/ahoj
    @GetMapping("/echo/{param}")
    public String helloWorldWithParam(@PathVariable String param) {
        return "ECHO, You typed: " + param;
    }

    // http get - localhost:9000/servlet/echoGET/ahoj
    @RequestMapping(value = "/echoGET/{param}", method = RequestMethod.GET)
    public String helloWorldWithParamOnlyGet(@PathVariable String param) {
        return "ECHO_GET, You typed: " + param;
    }

    // http get - localhost:9000/servlet/echoQuery?param=ahoj
    @GetMapping("/echoQuery")
    public String halloWorldWithQueryParam(@RequestParam String param) {
        return "ECHO_GUERY, You typed: " + param;
    }

}
