package oit.is.z0382.kaizi.janken.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0382.kaizi.janken.model.JankenCpu;




@Controller
@RequestMapping("/lec02")
public class Lec02Controller {
/**
   *
   * @param name
   * @param model
   * @return
   */
  @PostMapping("/lec02")
  public String lec02(@RequestParam String name, ModelMap model) {
    model.addAttribute("nameResult", name);
    return "lec02.html";
  }
  }
