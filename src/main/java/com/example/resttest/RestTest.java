package com.example.resttest;

import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class RestTest {


    @RequestMapping(value="/object",method = RequestMethod.POST)
    public @ResponseBody Greeting addProduct(@RequestBody Greeting g) {
        /*
        Postman
        raw and application/json
        {"content":"abc"} or {"id":"123","content":"abc"}
        return is in json {
                             "id": null,
                             "content": "abc"
                           }



***********************************************************
        Simple form submit
        <form id="health" action="http://localhost:8080/object" method="post">

        <input name="id" id="id" value="123">
        <input name="content" id="content" value="abc">
        <button type="submit">Add</button>
          Content type 'application/x-www-form-urlencoded;charset=UTF-8' not supported
         */

        Greeting greeting=new Greeting();
        greeting.setContent(g.getContent());
        greeting.setId(g.getId());
        System.out.println(greeting.getId());
        System.out.println(greeting.getContent());
        return greeting;
    }

}
