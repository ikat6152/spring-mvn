package com.example.SpringTest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleController
 *
 * @author danielpadua
 *
 * http://localhost:8080/api/hello
 */
/*@RestController
//@RequestMapping ("/api/example")
@RequestMapping ("/api")
public class Aa {

  //@GetMapping ("/hello-world")
  @GetMapping ("/hello")
  public ResponseEntity<String> get() {
    return ResponseEntity.ok("Hello World!  by  [[ KAT ]]");
  }
}*/
@Controller
public class Aa {
  @GetMapping({"/", "/index"})
  public String showPage(){
    return "index";
  }
  /*public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="KAT") String name) {
    model.addAttribute("name", name);
    return "index";
  }*/
}