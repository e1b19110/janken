package oit.is.z0382.kaizi.janken.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import oit.is.z0382.kaizi.janken.model.JankenCpu;




@Controller
@RequestMapping("/lec02")
public class Lec02Controller {
  @GetMapping
  public String lec02() {
    return "lec02.html";
  }




/**
   *
   * 
   */
  @PostMapping
  public String lec02(@RequestParam String name, ModelMap model) {
    model.addAttribute("nameResult", name);
    return "lec02.html";
  }


  /*@GetMapping
  public String gu(ModelMap model) {
    String Hand="グー";
    model.addAttribute("YouResult", Hand);
    return "lec02.html";
  }


  
  @GetMapping
  public String ch(ModelMap model) {
    String Hand="チョキ";
    model.addAttribute("YouResult", Hand);
    return "lec02.html";
  }



  @GetMapping
  public String pa(ModelMap model) {
    String Hand="パー";
    model.addAttribute("YouResult", Hand);
    return "lec02.html";
  }*/


 

  }
