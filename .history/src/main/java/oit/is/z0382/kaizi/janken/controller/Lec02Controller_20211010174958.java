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
   * @param name
   * @param model
   * @return 
   */
  @PostMapping
  public String lec02(@RequestParam String name, ModelMap model) {
    model.addAttribute("nameResult", name);
    return "lec02.html";
  }


  @GetMapping("gu")
  public String gu(ModelMap model) {
   String Hand="グー";
   String hand;
   String moji;
    model.addAttribute("YouResult", Hand);
    JankenCpu X = new JankenCpu(1);
    int cpu=X.getcpu();
    if(cpu==1){hand="グー";}
    else if(cpu==0){hand="チョキ";}
    else if(cpu==-1){hand="パー";}
    model.addAttribute("CpuResult", Hand);
    int result=X.getresult();
    if(result==1){moji="win";}
    else if(result==0){moji="drow";}
    else if(result==-1){moji="lose";}
    model.addAttribute("jankenResult", Hand);
    return "lec02.html";
  }


  
  @GetMapping("ch")
  public String ch(ModelMap model) {
  String  Hand="チョキ";
    model.addAttribute("YouResult", Hand);
    return "lec02.html";
  }



  @GetMapping("pa")
  public String pa(ModelMap model) {
  String  Hand="パー";
    model.addAttribute("YouResult", Hand);
    return "lec02.html";
  }


 

  }
