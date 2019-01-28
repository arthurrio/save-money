package com.github.savemoney.com.github.savemoney.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller


public class HelloWorldController {

    @RequestMapping(value = "/helloWorld")
    @ResponseBody
    public String helloWorld(){
        return "Hello World! Road to the top.";
    }

    @PostMapping("/helloWorldCrazy")
    @ResponseBody
    public String helloWorldCrazy(@RequestBody Test name ){
        return "Hello World! Crazy Road to the top." + name.getName1()+ name.getName();
    }
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Index";
    }

    @PostMapping("/desafioSensei")
    @ResponseBody
    public String desafioSensei(@RequestBody ObjetoSensei objetoSensei){
        return "Desafio: Teste do OBJETO. Description: " + objetoSensei.getDescription()+ " valor: "+ objetoSensei.getValue() ;
    }
}
class Test{

    private String name;
    private String name1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}