/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.springapp.controller;

import com.lfa.springapp.entity.Skill;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author risunurya
 */
@RestController
@RequestMapping(value = "/api/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "<h1>hello spring boot<h1>";
    }

    @RequestMapping(value = "/skill", method = RequestMethod.GET)
    public Skill skill() {

        return new Skill(1, "programming");
    }
    @RequestMapping(value="/skills" , method = RequestMethod.GET)
    public List<Skill> skills(){
        List<Skill> skills= new ArrayList<>();
       skills.add(new Skill(1, "programming"));
       skills.add(new Skill(2, "desingning"));
       skills.add(new Skill(3, "web developer"));
        return skills;
    }
   @RequestMapping(value= "/s", method = RequestMethod.GET)
    public ResponseEntity<Skill> s(){
        return ResponseEntity.ok(new Skill(1,"Front end"));
    }
    
        

}
