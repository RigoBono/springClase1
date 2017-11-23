/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Greeting;
import com.google.gson.Gson;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RigoBono
 */
@RestController
@RequestMapping("/service")
public class TestRestful {

    //http://localhost:8080/EJSpringMVC/service/getSaludo.htm
    @RequestMapping(value="getSaludo",method = RequestMethod.GET,produces="application/json")
    public @ResponseBody  String get(){
        Greeting g=new Greeting(1,"");
        Gson g1=new Gson();
        
        return g1.toJson(g);
    }
    
    //http://localhost:8080/EJSpringMVC/service/getSaludo2.htm?nombre=Rigo
    @RequestMapping(value="getSaludo2",method = RequestMethod.GET,produces="application/json")
    public @ResponseBody  String get(@RequestParam("nombre") String nombre){
        Greeting g=new Greeting(1,nombre);
        Gson g1=new Gson();
        
        return g1.toJson(g);
    }
    
 
}
