package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consf {
   @RequestMapping("dohello/{username}")
   public String dohello(@PathVariable("username") String username){
	   return "李静的明天"+username;
   }
   
}
